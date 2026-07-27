class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Arrays.sort(digits);
        HashSet<Integer> ans = new HashSet<>();
        for(int i =0; i<digits.length; i++){
           if(digits[i]==0) continue;

           for(int j=0; j<digits.length; j++){
            if(i==j) continue;

            for(int k=0; k<digits.length; k++){
                if(k==i ||k==j) continue;
                if(digits[k] %2 ==0){
                    int num = digits[i]*100+ digits[j]*10+ digits[k];
                    ans.add(num);
                }
            }
           }
        }
        int result[] = new int[ans.size()];
        int i=0;
        for(int idx: ans){
            result[i++]=idx;
        }
        Arrays.sort(result);
        return result;
    }
}
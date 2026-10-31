class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int count =0;
        for(int left =0; left<= n-k; left++){
            int sum=0;
        for(int i=left ; i<left + k; i++){
            sum += arr[i];
        }
        int avg =sum/k;
        if(avg>= threshold) {
            count++;
        }
        }
        return count;
    }
}
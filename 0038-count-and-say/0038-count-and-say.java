class Solution {
    public String countAndSay(int n) {
        String curr = "1";
        for(int i=1; i<n; i++){
            StringBuilder ans= new StringBuilder();
        
            int count =1;
            for(int j=1; j<curr.length(); j++){
                if(curr.charAt(j)==curr.charAt(j-1)) count++;
                 else {
                    ans.append(count);
                    ans.append(curr.charAt(j - 1));
                    count = 1;
                }
            }
            ans.append(count);
            ans.append(curr.charAt(curr.length() - 1));
            curr = ans.toString();
        }

        return curr;
    }
}
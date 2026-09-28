class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int ans =0;
        int count=0;
        for(int i =0; i<n; i++){
            if(s.charAt(i) == '('){
                  count++;
                   ans = Math.max(count,ans);
            }
            else if(s.charAt(i) == ')') {
                count--;
                continue;
            }
            if(count>ans) ans = count;
        }
        return ans;
    }
}
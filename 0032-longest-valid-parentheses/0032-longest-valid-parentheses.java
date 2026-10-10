class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> S = new Stack<>();
        int n = s.length();
        int [] ans = new int [n];
        for(int i = 0; i < n; ++i) 
           ans[i] = n + 1;   
        for(int i = 0; i < s.length(); ++i) 
            if(s.charAt(i) == '(') 
                S.push(i);
            else {
                if(S.size() > 0) {
                    ans[i] = S.peek();
                    S.pop();
                }
            }
        int A = 0 , cnt = 0;    
        for(int i = n - 1; i >= 0;) {
            if(ans[i] < i) {
               cnt += ((i - ans[i]) + 1);
               A = Math.max(A , cnt); 
               i = ans[i] - 1;
            } else {
                cnt = 0;
                --i;
            } 
        }    
        return A;         
    }
}
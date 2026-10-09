class Solution {
    public int minInsertions(String s) {
        int count =0;
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '(')  st.push(s.charAt(i));

            else{
            if(i+1<n && s.charAt(i) == ')' && s.charAt(i+1) == ')') i++;
            else count++;
            
             if (!st.isEmpty()) {
                    st.pop();
                } else {
                    count++;
                }
            }
        }
         count += st.size() * 2;

        return count;
    }
}
class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int count =0;
        Stack<Character> st = new Stack<>();
        for(int i =0; i<n; i++){
            if(s.charAt(i) == '(') {
                st.push(s.charAt(i));
                count++;
            }

            else{
                if(st.isEmpty() == false) {
                    st.pop();
                    count--;
                }else count++;
            }
        }
        return count;
    }
}
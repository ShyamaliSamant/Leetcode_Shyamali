class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb=new StringBuilder();
        int n = s.length();
        for(int i=0; i<n; i++){
            if(st.isEmpty()==true) st.push(s.charAt(i));
            else if(st.peek()==s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
            }
            while(st.isEmpty()==false){
                sb.append(st.pop());
            }
            return sb.reverse().toString();
    }
}
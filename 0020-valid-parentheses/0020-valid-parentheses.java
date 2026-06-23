class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<n;i++){
            char curr = s.charAt(i);
            if(curr == '(' || curr == '{' || curr=='[') stack.push(curr);
            else{
                if(stack.isEmpty()) return false;
                else if(curr == ')' && stack.peek() == '(') stack.pop();
                 else if(curr == '}' && stack.peek() == '{') stack.pop();
                  else if(curr == ']' && stack.peek() == '[') stack.pop();
                  else return false;
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}
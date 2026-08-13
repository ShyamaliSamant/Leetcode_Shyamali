class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        stack.push("");
        while (!stack.isEmpty()) {
            String s = stack.pop();
            if (s.length() == 2 * n) {
                if (isValid(s))
                    ans.add(s);
                continue;
            }
            stack.push(s + "(");
            stack.push(s + ")");
        }
        return ans;
    }
    boolean isValid(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') count++;
            else count--;
            if (count < 0) return false;
        }
        return count == 0;
    }
}
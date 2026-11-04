class Solution {
    public int maximum69Number (int num) {
        String numStr = String.valueOf(num);
        String resultStr = numStr.replaceFirst("6", "9");
        return Integer.parseInt(resultStr);
    }
}

class Solution {
    public int removePalindromeSub(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        if (s.equals(reverse)) return 1;

        return 2;
    }
}
class Solution {
    public int reverseDegree(String s) {
        int sum =0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int reverse = 26 -(c-'a');
            int index = i+1;
            int product = reverse*index;
            sum +=product;
        }
        return sum;
    }
}
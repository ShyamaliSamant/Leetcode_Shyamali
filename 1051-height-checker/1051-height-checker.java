class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int n = heights.length;
        int[] sorted = new int[n];
        for(int i=0; i<n; i++){
            sorted[i] = heights[i];
        }
        Arrays.sort(sorted);
        for(int i =0; i<n; i++){
            if(sorted[i] != heights[i]) count++;
        }
        return count;
    }
}
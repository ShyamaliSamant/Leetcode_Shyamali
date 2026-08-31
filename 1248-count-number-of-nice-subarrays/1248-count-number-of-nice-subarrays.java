class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] freq = new int[n+1];
        freq[0] = 1;
        int count =0;
        int curr =0;
        for(int num : nums){
            curr +=num%2;
            if(curr>=k){
                count += freq[curr-k];
            }
            freq[curr]++;
        }
        return count;
    } 
}
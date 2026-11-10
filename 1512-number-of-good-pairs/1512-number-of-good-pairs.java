class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int count =0;
        int j =0; 
        while(j<n){
            for(int i=0; i<n; i++){
                if(nums[i] == nums[j] && j<i) count++;
            }
            j++;
        }
        return count;
    }
}
class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int i=0;
        int count=0;
        int j=i+1;
       while (j < n) {
            if (i == j || nums[j] - nums[i] < k) {
                j++;
            }
            else if (nums[j] - nums[i] > k) {
                i++;
            }
            else {
                count++;
                i++;
                j++;
                while (j < n && nums[j] == nums[j - 1])
                    j++;
            }
        }
        return count;
    }
}
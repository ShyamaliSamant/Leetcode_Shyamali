class Solution {
    public int minimumPairRemoval(int[] nums) {
           int count = 0;
        while(nums.length > 0) {
            int n = nums.length;
            int min = Integer.MAX_VALUE;
            int inx = n - 1;
            boolean isSort = true;
            for(int i = 0; i < n - 1; ++i)
                 if(nums[i] > nums[i + 1])
                    isSort = false;
            if(isSort)
                return count;
            for(int i = n - 2; i >= 0; --i)
                if(nums[i] + nums[i + 1] <= min) {
                    min = nums[i] + nums[i + 1];
                    inx = i;
                }
            int [] temp = new int[n - 1];
            int ix = 0;
            for(int i = 0; i < n; ++i)
               if(i == inx) {
                   temp[ix++] = min;
               } else if(i == inx + 1) {
               } else {
                    temp[ix++] = nums[i];
               }
            nums = temp;
            ++count;
        }
        return count;
    }
}
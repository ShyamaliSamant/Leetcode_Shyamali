// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int ans[] = {-1, -1};
//         for(int i=0; i<nums.length; i++){
//             if(nums[i]==target){
//               if(ans[0]==-1) ans[0]=i;
//             ans[1]=i;
//             }
//         }
//         return ans;
//     }
// }
class Solution{
    public int first(int[] nums, int target){
        int low =0;
        int high =nums.length-1;
        int ans =-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(nums[mid]==target){
                ans = mid;
                high = mid - 1; 
            } else if (nums[mid] < target) low = mid + 1;   
             else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public int second(int[] nums, int target){
        int low=0;
        int high = nums.length-1;
        int ans =-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid] ==target){
                ans =mid;
                low =mid+1;
            }else if (nums[mid] < target) low = mid + 1;   
             else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target){
          int first = first(nums, target);
        int last = second(nums, target);

        return new int[]{first, last};
    }
}

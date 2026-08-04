class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int prev = nums[0];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1; i<nums.length; i++){
            while(nums[i] != prev +1){
                ans.add(++prev);
            }
            prev = nums[i];
        }
       
        return ans;
    }
}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i] , 0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        for(int value : map.keySet()){
            int count = map.get(value);
            if(count> n/3) ans.add(value);
        }
        return ans;
    }
}

class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int[] pair : items1) {
           map.put(pair[0], map.getOrDefault(pair[0],0)+ pair[1]);
        }
        for(int[] pair : items2){
            map.put(pair[0], map.getOrDefault(pair[0],0)+ pair[1]);
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int key : map.keySet()) {
            List<Integer> temp = new ArrayList<>();
            temp.add(key);
            temp.add(map.get(key));
            res.add(temp);
        }
        // sort by key (value)
        res.sort((a, b) -> a.get(0) - b.get(0));
        return res;
    }
}
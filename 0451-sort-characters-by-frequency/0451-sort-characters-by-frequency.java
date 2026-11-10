class Solution {
    public String frequencySort(String s) {
       String ans ="";
       int n = s.length();
       HashMap<Character, Integer> map = new HashMap<>();
       for(int i=0; i<n; i++){
        map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        } 
          List<Character> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a));
        for (char ch : list) {
            for(int i =0; i<map.get(ch); i++){
                ans+= ch;
            }
        }
            return ans;
    }
}
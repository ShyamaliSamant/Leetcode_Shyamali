class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<String,Integer> map1 = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        map1.put("IV", 4);
        map1.put("IX" ,9);
        map1.put("XL" ,40);
        map1.put("XC" ,90);
        map1.put("CD" ,400);
        map1.put("CM" ,900);
        int ans =0;
        for(int i=0; i<s.length(); i++){
            if(i+1<s.length()){
            StringBuilder C = new StringBuilder();
            C.append(s.charAt(i));
            C.append(s.charAt(i+1));
            if(map1.containsKey(C.toString())){

                ans += map1.get(C.toString());
                i++;
                continue;
            }
            }
            ans += map.get(s.charAt(i));
        }
        return ans;
    }
}
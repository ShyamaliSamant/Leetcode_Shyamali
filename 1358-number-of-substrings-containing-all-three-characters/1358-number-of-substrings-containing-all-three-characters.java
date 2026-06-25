class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int l=0,r=0;
        int count=0;
        HashMap<Character,Integer> map= new HashMap<>();
        while(r<n){
           int frq= map.getOrDefault(s.charAt(r),0);
           map.put(s.charAt(r),frq+1);
           while(l<=r && map.size()>=3){
            count+=n-r;
            frq=map.getOrDefault(s.charAt(l),0);
            frq--;
            if(frq ==0)map.remove(s.charAt(l));
            else map.put(s.charAt(l),frq);
            l++;
           }
           r++;
        }
        return count;
    }
}
class Solution {
    public String longestPalindrome(String s) {
       int n=s.length();
       int index = 0;
       int len =0;
       for(int i=0;i<n; i++){
        int left=i,right=i;
        while(left>=0 && right <n && s.charAt(left)==s.charAt(right)){
            if(len <right-left+1){
                index=left;
                len = right-left+1;
            }
            left--;
            right++;
        }
        left=i;
        right=i+1;
        while(left>=0 && right <n && s.charAt(left)==s.charAt(right)){
             if(len <right-left+1){
                index=left;
                len = right-left+1;
            }
            left--;
            right++;
           }  
        }
        return s.substring(index,index+len);
     }
}
    

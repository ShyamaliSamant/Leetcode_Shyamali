class Solution {
    public int countCommas(int n) {
        // int count =0;
        // for(int i =0; i<=n; i++){
        // if(i>=1000){
        //     count++;
        // }
        // }
        if(n<1000){
            return 0;
        }
        return (n-1000)+1;
       
    }
}
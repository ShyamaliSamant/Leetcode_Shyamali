class Solution {
    public int arrangeCoins(int n) {
     long high =n;
     long low =1;
     while(low <= high){
        long mid = low + (high - low )/2;
        if(mid*(mid+1)/2 == n){
           return (int)mid;
        }
        if(mid* (mid+1)/2 < n){
            low = mid+1;
        }else{
            high = mid -1;
        }
     }
     return (int)low-1;
    }
}
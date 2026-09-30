class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        
        int radius = 0;
        for(int h : houses){
            int left =0;
            int right = heaters.length -1 ;
            while(left<= right){
                int mid = left +(right - left )/2;
                if(heaters[mid] < h){
                    left = mid +1;
                }else{
                    right = mid-1;
                }
            }
            int d_right = Integer.MAX_VALUE;
            int d_left = Integer.MAX_VALUE;
            if(left < heaters.length){
                d_right = heaters[left] - h;
            }
            if(left -1 >=0){
                d_left = h - heaters[left -1];
            }
            int minDistance = Math.min(d_left, d_right);
            radius = Math.max(radius, minDistance);
        }
        return radius;
        }

    }
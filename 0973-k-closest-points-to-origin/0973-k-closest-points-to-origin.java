class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> p = new PriorityQueue<>(
        (a,b) ->{
            int d1 = a[0]*a[0]+a[1]*a[1];
            int d2 =b[0]*b[0]+b[1]*b[1];
            return d2-d1;
        }
        );
        for(int i=0; i<points.length; i++){
            p.offer(points[i]);
            if(p.size()>k){
                p.poll();
            }
        }
        int ans[][]=new int[k][2];
        for(int i=0;i<k;i++){
            ans[i]=p.poll();
        }
        return ans;
    }
}
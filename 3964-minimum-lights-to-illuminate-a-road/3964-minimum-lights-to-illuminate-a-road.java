class Solution {
    public int minLights(int[] lights) {
         int n=lights.length;
         int prefix[]=new int[n];
         for(int i=0; i<n; i++){
            if(lights[i]==0) continue;
            int l= Math.max(0,i-lights[i]);
            int r =Math.min(n-1,i+lights[i]);
            prefix[l]++;
            if(r+1 <n) prefix[r+1]--;
         }
            for(int i=1;i<n;i++){
            prefix[i] +=prefix[i-1];
         }
         
         int count = 0;
         int ans=0;
         for(int i=0;i<n; i++){
            if(prefix[i] ==0) count++;
            else{
            ans+=Math.ceil(count/3.0);
            count = 0;
         }
         }
         ans+=Math.ceil(count/3.0);
         return ans;
    }
}
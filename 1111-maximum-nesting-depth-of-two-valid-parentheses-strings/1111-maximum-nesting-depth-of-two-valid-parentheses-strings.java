class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] depth = new int[n];
        Stack<Integer> st = new Stack<>();

        int maxDepth =0;
        for(int i =0; i<n; i++){
            if(seq.charAt(i) == '('){
                if(st.size()>0) depth[i] = depth[st.peek()] + 1;

                maxDepth =Math.max(maxDepth, depth[i]);
                st.push(i);
            }else{
                depth[i] = depth[st.peek()];
                maxDepth =Math.max(maxDepth, depth[i]);
                st.pop();
            }
        }
        int[] ans = new int[n];
        for(int i=0; i< n; i++){
            if(depth[i] %2 ==0)
            ans[i] =0;

            else
            ans[i] =1;
        }
        return ans;

    }
}
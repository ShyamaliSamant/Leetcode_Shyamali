class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n=arr.length;
        Stack<Integer> st = new Stack<>();
        int ans[]=new int[n];
        for(int i=n-1;i>=0; i--){
            while(st.isEmpty() == false && arr[st.peek()] <= arr[i]) st.pop();
            if(st.isEmpty() == false) ans[i] = st.peek()-i;
            else ans[i] = 0;
            st.push(i);
        }
        return ans;
    }
}
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n= asteroids.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(asteroids[i]>0){
                st.push(asteroids[i]);
            }else{
                int curr = Math.abs(asteroids[i]);
                while(st.isEmpty()== false && st.peek() >0){
                    if(curr ==st.peek()){
                        curr =0;
                        st.pop();
                        break;
                    }
                    else if(curr >st.peek()){
                        st.pop();
                    }
                    else {
                        curr =0;
                        break;
                    }
                }
                if(curr !=0) st.push(asteroids[i]);
            }
        }
        int ans[] = new int[st.size()];
        while(!st.isEmpty()){
            ans[st.size()-1] = st.peek();
            st.pop();
        }
        return ans;
    }
}
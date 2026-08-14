class Solution {

    public int[] dailyTemperatures(int[] temperatures) {

        int ans[] = new int[temperatures.length];
        int n = temperatures.length;
        ans[n-1] = 0;
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        for(int i = n - 2; i >= 0; i--){
            while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]){
                st.pop();
            }

            ans[i] = st.isEmpty() ? 0 : st.peek() - i;
            st.push(i);
        }
        return ans;
    }
}
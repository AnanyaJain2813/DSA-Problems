class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> st = new Stack<>();

        int []arr = new int[temperatures.length];
        arr[temperatures.length - 1] = 0;
        st.push(temperatures.length - 1);

        int i = temperatures.length - 2;
        while( i >= 0 && !st.isEmpty()){
    
            while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]){
                st.pop(); 
            }

              if(!st.isEmpty() && temperatures[st.peek()] > temperatures[i]){
                    arr[i] = st.peek() - i;
             }
               else arr[i] = 0;

            st.push(i);
            i--;
        }
        return arr;
    }
}
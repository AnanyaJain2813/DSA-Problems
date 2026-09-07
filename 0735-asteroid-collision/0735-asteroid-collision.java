class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i : asteroids){
           
            boolean f = true;
            while(!st.isEmpty() && st.peek() > 0 && i < 0){
                int peek = st.peek();
                if(Math.abs(i) > peek){
                    st.pop();
                }
            
                else if(Math.abs(i) == peek){
                    st.pop();
                    f = false;
                    break;
                }
                else{
                    f = false;
                    break;
                }
            }
            if(f){
                st.push(i);
            }
        }
        int arr[] = new int[st.size()];
        int k = 0;
        for(int j : st){
            arr[k++] = j;
        }
        return arr;
    }
}
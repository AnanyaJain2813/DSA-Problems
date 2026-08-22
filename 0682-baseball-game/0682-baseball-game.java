class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();
        int sum = 0;
        for(int i = 0; i < operations.length; i++){
         
            String a = operations[i];
            if(a.equals("C")){
                int b = st.pop();
                sum = sum - b;
            }

            else if(a.equals("D")){
                int b = st.peek() * 2;
                sum += b;
                st.push(b);
            }
            else if(a.equals("+")){
                int b = st.pop();
                int bb = st.pop();
                int c = bb + b;
                st.push(bb);
                st.push(b);
                st.push(c);
                sum += c;
          }
          else{
            int x = Integer.parseInt(a);
            sum += x;
            st.push(x);
          }
            
        }
        return sum;
        
    }
}
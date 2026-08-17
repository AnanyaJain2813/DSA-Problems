class Solution {
    public String removeKdigits(String num, int k) {

        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < num.length(); i++){
            int ch = num.charAt(i) - '0';
            while(k > 0 && !st.isEmpty() && st.peek() > ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }

        while(k > 0){
            st.pop();
            k--;
        }

        if(st.isEmpty()) return "0";

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
    
        String d = sb.reverse().toString();
        int i = 0;
        while(i < d.length()-1 && d.charAt(i) == '0') i++;
        
        d = d.substring(i);
        // d = d.replaceFirst("^0+","");
        return d;
        
    }
}
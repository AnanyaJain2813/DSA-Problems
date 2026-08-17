class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> st = new Stack<>();
        for(String s : arr){
            if(s.equals("") || s.equals(".")) continue;

            if(s.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else st.push(s);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0, "/" + st.pop());
        }
        return sb.length() == 0? "/" : sb.toString(); 
    }
}
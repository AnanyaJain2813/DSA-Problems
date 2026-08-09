class Solution {
    public String reverseWords(String s) {

        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' '){
              if(sb.length() > 0){
                ans.add(sb.toString());
                sb.setLength(0);
              }
            }
            else{
                sb.append(ch);
            }
        }

        if(sb.length() > 0) ans.add(sb.toString());
        Collections.reverse(ans);
        return String.join(" ", ans);
       
    }
}
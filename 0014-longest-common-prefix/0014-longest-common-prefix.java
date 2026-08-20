class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0) return "";
        Arrays.sort(strs);
        String a = strs[0];
        String b = strs[strs.length - 1];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < Math.min(a.length(), b.length()); i++){
            if(a.charAt(i) == b.charAt(i)){
                sb.append(a.charAt(i));
            }
            else break;
        }
        return sb.toString();
    }
}
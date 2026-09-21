class Solution {
    public int lengthOfLastWord(String s) {
        int cnt = 0;
        for(int i = s.length()-1; i >= 0; i--){
            if(Character.isLetterOrDigit(s.charAt(i))) cnt++;
            else{
                if(cnt > 0) break;
            }
        }
        return cnt;
    }
}
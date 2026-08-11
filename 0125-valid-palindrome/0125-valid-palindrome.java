class Solution {
    public boolean isPalindrome(String s) {

        // int i = 0, j = s.length()- 1;
        // s = s.toLowerCase();
        // while(i < j){
        //     if(!Character.isLetterOrDigit(s.charAt(i))) i++;
        //     else if(!Character.isLetterOrDigit(s.charAt(j))) j--;
            
        //     else{
        //         if(s.charAt(i) != s.charAt(j)){
        //         return false;
        //     }
        //     i++;
        //     j--;
        //     }
        // }
        // return true;

        int i = 0, j = s.length() - 1;
        s = s.toLowerCase();
        StringBuilder sb  = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)) sb.append(ch);
        }
        if(sb.toString().equals(sb.reverse().toString())) return true;
        return false;
    }
}
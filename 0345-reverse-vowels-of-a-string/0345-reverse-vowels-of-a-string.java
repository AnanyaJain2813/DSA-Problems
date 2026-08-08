class Solution {
    public String reverseVowels(String s) {

        String rev = "";
        for(int i = s.length()-1; i >= 0; i--){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' ||

               ch == 'o' || ch == 'u' ||

               ch == 'A' || ch == 'E' || ch == 'I' ||

               ch == 'O' || ch == 'U'){
                rev += s.charAt(i);
            }
        }
        int j = 0;
        String b = "";
      
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if( j < rev.length() && (ch == 'a' || ch == 'e' || ch == 'i' ||

               ch == 'o' || ch == 'u' ||

               ch == 'A' || ch == 'E' || ch == 'I' ||

               ch == 'O' || ch == 'U' )){
                b += rev.charAt(j);
                j++;
            }
            else{
                b+= s.charAt(i);
            }
        }
        return b;
    }
}
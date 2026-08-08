class Solution {
    public static boolean vo(char ch){
        if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') return true;
        return false;
    }
    public String reverseVowels(String s) {

       char ch[] = s.toCharArray();

       int i = 0, j = s.length() - 1;
       
       while(i < j){
        char a = ch[i];
        char b = ch[j];
        while(i < j && !vo(a)){
            i++;
            a = ch[i];
        }
        while(i < j && !vo(b)){
            j--;
            b = ch[j];
        }

        char te = ch[i];
        ch[i] = ch[j];
        ch[j] = te;
        i++;
        j--;
       }       
       return new String(ch);
    }
}
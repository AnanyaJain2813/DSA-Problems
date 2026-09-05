class Solution {
    
    public String convertToTitle(int columnNumber) {

        int n = columnNumber;
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            n--;
            int c = n % 26; //Last character kaise nikaalun?
            n = n/26; //Jo part process ho gaya usko hata diya.
            sb.append((char)(c + 'A'));
        }
        return sb.reverse().toString();
    }
}
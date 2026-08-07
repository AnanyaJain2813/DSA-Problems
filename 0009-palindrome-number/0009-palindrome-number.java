class Solution {
    public boolean isPalindrome(int x) {

        String s = String.valueOf(x);
        char c[] = s.toCharArray();

        int i = 0, j = c.length - 1;

        while(i <= j){
            if(c[i] != c[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        
        int rev = 0;
        int og = x;

        while(og > 0){
            int d = og % 10;
            rev = rev * 10 + d;
            og = og / 10;
        }
        if(rev == x) return true;
        else return false;

    }
}
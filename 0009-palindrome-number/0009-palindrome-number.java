class Solution {
    public boolean isPalindrome(int x) {
        
       if(x < 0)return false;
       int og = x;
       int ans = 0;
       while(og != 0){
        int d = og % 10;
        ans = ans * 10 + d;
        og = og/10;
       }
       if(ans == x) return true;
       return false;

    }
}
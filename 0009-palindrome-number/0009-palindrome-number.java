class Solution {
    public boolean isPalindrome(int x) {

      int tp = 0;
      int temp = x;

      while(temp > 0){
        int a = temp%10;
        tp = tp*10 + a;
        temp = temp/10;
      }
      return tp == x;
    }
}
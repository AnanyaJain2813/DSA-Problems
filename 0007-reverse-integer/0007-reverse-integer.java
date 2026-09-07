class Solution {
    public int reverse(int x) {
        
        int rev = 0;
        int og = x;
        if( x < 0){
            og = -og;
        }
        while(og > 0){
            int d = og % 10;
            if(rev > Integer.MAX_VALUE/10) return 0;
            
            rev = rev * 10 + d;
            og = og/10;
        }

        if(x < 0){
            rev = -rev;
        }
        return rev;
    }
}
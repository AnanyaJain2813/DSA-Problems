class Solution {
    public int mySqrt(int x) {

        int ans = 1;
        if(x == 0) return 0;
        for(int i = 1; i <= x/2; i++){
            long prod = (long)i * i;
            if(prod == x) return i;
            else if(prod < x){
                ans = i;
            }
            else{
                break;
            }
        }
        return ans;
    }
}
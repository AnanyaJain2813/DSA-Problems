class Solution {
    public int[] countBits(int n) {

        int []ans = new int[n+1];
      
        ans[0] = 0;
        
        for(int i = 1; i <= n; i++){
            int c = 0;
            int a = i;
            while(a != 0){
                a = (a & (a-1));
                c++;
            }
            ans[i] = c;
        }
        return ans;
    }
}
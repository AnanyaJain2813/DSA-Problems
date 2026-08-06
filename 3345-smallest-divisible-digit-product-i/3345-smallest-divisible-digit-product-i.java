class Solution {
    public int smallestNumber(int n, int t) {

        
       
        while(true){  
           int a = n;
           int ans = 1;
           while(a > 0){
            ans = ans * (a%10);
            a = a/10;
           }
            if(ans % t == 0) return n;
            n++; 
        }

        
    }
}
class Solution {
    public int getnum(int n){
        int op = 0;
        while( n > 0){
            int d = n % 10;
            op += d * d;
            n = n/10;
        }
        return op;
    }
    public boolean isHappy(int n) {
        
        Set<Integer> st = new HashSet<>();
        while(!st.contains(n)){
            st.add(n);
            n = getnum(n);
            if(n == 1) return true;
        }
        return false;

    }
}
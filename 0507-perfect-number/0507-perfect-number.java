class Solution {
    public boolean checkPerfectNumber(int num) {
        int cnt = 0;
        for(int i = 1; i <= num/2; i++){
            if(num % i == 0){
                cnt = cnt + i;
            }
        }
        if(cnt == num) return true;
        return false;
    }
}
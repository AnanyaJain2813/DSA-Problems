class Solution {
    public int hammingWeight(int n) {
        String m = Integer.toBinaryString(n);
        int cnt = 0;
        for(int i = 0; i < m.length(); i++){
            char ch = m.charAt(i);
            if(ch == '1'){
                cnt++;
            }
        }
        return cnt;
    }
}
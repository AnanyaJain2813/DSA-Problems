class Solution {
    public int call(String s, int i){
        if(s.charAt(i) == 'I') return 1;
        else if(s.charAt(i) == 'V') return 5;
        else if(s.charAt(i) == 'X') return 10;
        else if(s.charAt(i) == 'L') return 50;
        else if(s.charAt(i) == 'C') return 100;
        else if(s.charAt(i) == 'D') return 500;
        else return 1000;

    }
    public int romanToInt(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            int c = call(s, i);
            if(i + 1 < s.length() && c < call(s, i+1)){
                 sum = sum - c;
            }
            else sum += c;
        }
        return sum;
    }
}
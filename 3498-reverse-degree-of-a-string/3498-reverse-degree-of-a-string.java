class Solution {
    public int reverseDegree(String s) {
        // Map<Character, Integer> map = new HashMap<>();
        // int i = 26;

        // for(i = 26; i >= 1; i--){
        //     char ch = 'a'
        //     map.put(ch, i);
            
        // }

        char ch = 26;
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            int pro = ch - (s.charAt(i) - 'a');
            sum += pro * (i+1);
        }
        return sum;
    }
}
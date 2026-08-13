class Solution {
    public static boolean vo(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                return true;
            }
            return false;
    }
    public int maxVowels(String s, int k) {

        int l = 0;
        int cnt = 0;
        int max = 0;
        for(int i = 0; i < k; i++){
            char ch = s.charAt(i);
            if(vo(ch)){
                cnt++;
            }
        }
        max = cnt;
        for(int j = k; j < s.length(); j++){
            char ch = s.charAt(j);
            if(vo(ch)) cnt++;

            char a = s.charAt(l);
            if(vo(a)) cnt--;
            l++;
            
            max = Math.max(cnt,max);
        }

        return max;
        
    }
}
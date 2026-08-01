class Solution {
    public int getLucky(String s, int k) {
        
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            int ch = s.charAt(i) - 'a'+1;
            str.append(ch);
        }
        int n = str.length();
        int cnt = 0;

       for(int j = 1; j <= k; j++){
         cnt = 0;
          for(int i = 0; i < str.length(); i++){
            cnt += str.charAt(i)-'0';
            if(i == str.length() - 1){
                str.setLength(0);
                str.append(cnt);
            }
        }
        }
        return cnt;
    }
}

    
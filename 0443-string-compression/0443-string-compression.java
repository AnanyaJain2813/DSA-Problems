class Solution {
    public int compress(char[] chars) {

      int ans = 0;
      for(int i = 0; i < chars.length;){
        int cnt = 0;
        char ch = chars[i];
    
        while(i < chars.length && ch == chars[i]){
            cnt++;
            i++;
        }

        chars[ans++] = ch;
        if(cnt > 1){
            String s = String.valueOf(cnt);
            for(char c : s.toCharArray()){
                chars[ans] = c;
                ans++;
            }  
        }
      }
        return ans;
    }
}
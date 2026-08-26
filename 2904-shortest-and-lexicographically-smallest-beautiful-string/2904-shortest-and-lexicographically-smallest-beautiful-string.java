class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        int l = 0;
        int cnt = 0;
        String ans = "";

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1')cnt++;

        while(cnt > k){
            if(s.charAt(l) == '1') cnt--;
            l++;
        }


        if(cnt == k){

            while(s.charAt(l) == '0') l++;

            String sub = s.substring(l, i+1);
            if(ans.isEmpty() || sub.length() < ans.length() || sub.length() == ans.length() && sub.compareTo(ans) < 0){
                ans = sub;
            }
        }
        }
        return ans;
    }
}
class Solution {
    public String mergeAlternately(String word1, String word2) {

        int l = 0, r = 0;
        String a = "";
        while(l < word1.length() && r < word2.length()){
            a += word1.charAt(l);
            a += word2.charAt(r);
            l++;
            r++;
        }
        while(l < word1.length()){
            a += word1.charAt(l);
            l++;
        }
          while(r < word2.length()){
            a += word2.charAt(r);
            r++;
        }

        return a;
    }
}
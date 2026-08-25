class Solution {
    public void rev(char[]c , int i, int j){
        while(i < j){
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
    }
    public String reverseStr(String s, int k) {

        char []c = s.toCharArray();
        if(s.length() < k){
            rev(c, 0, s.length()-1);
            return new String(c);
        }
       
        if(s.length() <= 2*k && s.length() >= k){
         rev(c, 0, k - 1);
         return new String(c);
     }


        if(s.length() > 2*k){
            rev(c, 0, k-1);
            for(int i = 2*k; i < s.length(); ){
                int end = Math.min(i + k -1, c.length - 1);
                rev(c, i, end);
                i += (2*k);
            }
        }
        return new String(c);
    }
}
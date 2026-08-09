class Solution {
    public static int gcd(int a , int b){
        while(a != 0){
            int temp = b % a;
            b = a;
            a = temp;
        }
        return b;
    }
    public String gcdOfStrings(String str1, String str2) {

        if(!(str1+str2).equals(str2+str1)) return "";
        else{
            int len = gcd(str1.length(), str2.length());
            String s = str2.substring(0,len);

            return s;
        }
        
    }
}
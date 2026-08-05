class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder(num1);
        StringBuilder tb = new StringBuilder(num2);
        StringBuilder s = new StringBuilder();
        sb.reverse();
        tb.reverse();

        char []a = sb.toString().toCharArray();
        char []b = tb.toString().toCharArray();
       
        int i = 0, j = 0;
        int c = 0;
        while(i < a.length && j < b.length){
           int p = (a[i] - '0') + (b[j]-'0') + c;
           c = p/10;
           p = p%10;

           s.append(p);
         
           i++;
           j++;
        }

        while(i < a.length){
            int p = (a[i]-'0') + c;
            c = p/10;
            p = p%10;

            s.append(p);
            i++;
        }
         while(j < b.length){
            int p = (b[j]-'0') + c;
            c = p/10;
            p = p%10;
            s.append(p);
            j++;
        }
        if(c != 0) s.append(c);
        s.reverse();

        return s.toString();
    }
}

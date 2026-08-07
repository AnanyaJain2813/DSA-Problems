class Solution {
    public boolean isSubsequence(String s, String t) {

     
     int index = -1;
     boolean flag = false;
     int i = 0, j=0;
        for( i = 0; i < s.length(); i++){
            flag = false;
            for(j = index+1; j < t.length(); j++){
                if(s.charAt(i) == t.charAt(j)){
                    index = j;
                    flag = true;
                    break;
            }      
            }
           
            if(flag == false){
                return false;
            }
             
            
        }
       
return true;

        
    }
}
class Solution {
    public boolean checkIfPangram(String sentence) {

        int hash[] = new int[26];
        for(int i = 0; i < sentence.length() ; i++){
            hash[sentence.charAt(i) - 'a']++;
        }

        for(int i = 0; i < hash.length; i++){
            if(hash[i] < 1) return false;
        }
        return true;
        
    }
}
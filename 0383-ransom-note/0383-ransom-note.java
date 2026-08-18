class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;

        Map<Character, Integer> have = new HashMap<>();
        Map<Character, Integer> need = new HashMap<>();

        for(int i = 0; i < ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            need.put(ch, need.getOrDefault(ch, 0)+1);
        }
        for(int i = 0; i < magazine.length(); i++){
            char ch = magazine.charAt(i);
            have.put(ch, have.getOrDefault(ch, 0)+1);
        }

        for(char ch : need.keySet()){
            int fn = need.get(ch);
            int fh = have.getOrDefault(ch,0);
            if(fh < fn) return false;
        }
        return true;
    }
}
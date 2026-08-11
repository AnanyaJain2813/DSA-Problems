class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List> map = new HashMap<>();

        for(String s : strs){

            int cnt[] = new int[26];
            for(char c : s.toCharArray()){
                cnt[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 26; i++){
                sb.append(",");
                sb.append(cnt[i]);
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key, new ArrayList());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
            //map ki values ko arraylist ki tarah return kar rahe hain
    }
}
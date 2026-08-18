class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> bal = new HashMap<>();
        bal.put('b', 1);
        bal.put('a', 1);
        bal.put('o', 2);
        bal.put('l', 2);
        bal.put('n', 1);

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(bal.containsKey(ch)){
                map.put(ch, map.getOrDefault(ch,0)+1);
            }
        }
        int ans = Integer.MAX_VALUE;
        if(bal.size() > map.size()) return 0;

        for(char ch : bal.keySet()){
            if(bal.get(ch) > map.get(ch)) return 0;
            int come = map.getOrDefault(ch,0)/bal.get(ch);
            ans = Math.min(come, ans);
        }
        return ans;
    }
}
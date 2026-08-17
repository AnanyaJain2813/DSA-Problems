import java.util.*;
class Solution {
    public String removeDuplicates(String s, int k) {

        Stack<Map.Entry<Character, Integer>> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(st.isEmpty()){
                st.push(new AbstractMap.SimpleEntry<>(ch, 1));
                continue;
            }
            Map.Entry<Character, Integer> p = st.peek();
            if(p.getKey() == ch){
                int cnt = p.getValue() + 1;
                if(cnt == k) st.pop();
                else{
                    p.setValue(cnt);
                }
            }

            else{
                st.push(new AbstractMap.SimpleEntry<>(ch,1));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            Map.Entry<Character, Integer> mp = st.pop();
            for(int i = 0; i < mp.getValue(); i++){
                sb.append(mp.getKey());
            }
        }
        return sb.reverse().toString();
    }
}
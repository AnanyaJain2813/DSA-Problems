import java.util.*;
class Solution {
    static class Pair{
        char ch;
        int cnt;
        Pair(char ch, int cnt){
            this.ch = ch;
            this.cnt = cnt;
        }
    }
    public String removeDuplicates(String s, int k) {

        // Stack<Map.Entry<Character, Integer>> st = new Stack<>();

        // for(char ch : s.toCharArray()){
        //     if(st.isEmpty()){
        //         st.push(new AbstractMap.SimpleEntry<>(ch, 1));
        //         continue;
        //     }
        //     Map.Entry<Character, Integer> p = st.peek();
        //     if(p.getKey() == ch){
        //         int cnt = p.getValue() + 1;
        //         if(cnt == k) st.pop();
        //         else{
        //             p.setValue(cnt);
        //         }
        //     }

        //     else{
        //         st.push(new AbstractMap.SimpleEntry<>(ch,1));
        //     }
        // }
        // StringBuilder sb = new StringBuilder();
        // while(!st.isEmpty()){
        //     Map.Entry<Character, Integer> mp = st.pop();
        //     for(int i = 0; i < mp.getValue(); i++){
        //         sb.append(mp.getKey());
        //     }
        // }
        // return sb.reverse().toString();

        Stack<Pair> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                st.push(new Pair(ch,1));
                continue;
            }

            Pair p = st.peek();
            if(p.ch == ch){
                p.cnt = p.cnt + 1;
                if(p.cnt == k) st.pop();
            }

            else{
                st.push(new Pair(ch, 1));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            Pair p = st.pop();
            for(int i = 0; i < p.cnt; i++) sb.append(p.ch);
        }
        return sb.reverse().toString();
    }
}
class Solution {
    public String reorganizeString(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for(char i : s.toCharArray()){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->map.get(b)- map.get(a));

        StringBuilder sb = new StringBuilder();

        for(char i : map.keySet()){
            pq.offer(i);
        }

        while(!pq.isEmpty()){
            Character ch = pq.poll();
            if(sb.length() == 0 || sb.charAt(sb.length() - 1) != ch){
                sb.append(ch);
                map.put(ch, map.get(ch)-1);
                if(map.get(ch)>0){
                    pq.offer(ch);
                }
            }
            else{
                if(pq.isEmpty()) return "";
                char a = pq.poll();
                sb.append(a);
                map.put(a, map.get(a) - 1);
                if(map.get(a) > 0) pq.offer(a);

                pq.offer(ch);
            }

        }
        return sb.toString();
    }
}
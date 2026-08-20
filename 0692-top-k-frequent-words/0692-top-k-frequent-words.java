class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> map = new HashMap<>();
        for(String i : words){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        PriorityQueue<String> pq = new PriorityQueue<>((a,b)->{
            if(map.get(a).equals(map.get(b))) return b.compareTo(a);
            return Integer.compare(map.get(a), map.get(b));
        });
        
        for(String i : map.keySet()){
            pq.offer(i);
            if(pq.size()>k) pq.poll();
        }
        
        List<String> ls = new ArrayList<>(pq);
        ls.sort((a,b)->{
            if(map.get(a).equals(map.get(b))) return a.compareTo(b);
            return Integer.compare(map.get(b), map.get(a));
        });
        return ls;
    }
}
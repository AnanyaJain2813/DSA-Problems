class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> map = new HashMap<>();
        for(String i : words){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        PriorityQueue<String> pq = new PriorityQueue<>((a,b)->{
            if(map.get(a).equals(map.get(b))) return a.compareTo(b);
            return Integer.compare(map.get(b), map.get(a));
        });
        
        for(String i : map.keySet()){
            pq.offer(i);
        }
        
        List<String> ls = new ArrayList<>();
        for(int i=0;i<k;i++){
            ls.add(pq.poll());
        }
        return ls;
    }
}
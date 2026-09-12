class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : stones){
            heap.offer(i);
        }

        int ans = 0;
        
        while(heap.size() > 1){
            
            int x = heap.poll();
            int y = heap.poll();
            
            if(y != x) heap.offer(x - y);
        }
        if(heap.isEmpty()) return 0;
        return heap.poll();
    }
}
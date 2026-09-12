class KthLargest {

    private PriorityQueue<Integer>pq;
    int l;
    public KthLargest(int k, int[] nums) {
        this.l = k;
        pq = new PriorityQueue<>(k);
        for(int i : nums){
            if(pq.size() < k) pq.offer(i);

            else if(i > pq.peek()){
                pq.poll();
                pq.offer(i);

            }
        }
        
    }
    
    public int add(int val) {
        if(pq.size() < l){
            pq.offer(val);
        }
        else if(val > pq.peek()){
            pq.poll();
            pq.offer(val);
        }

        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
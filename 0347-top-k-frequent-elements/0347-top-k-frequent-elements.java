class Solution {
    public int[] topKFrequent(int[] nums, int k) {

    //    HashMap<Integer, Integer> map = new HashMap<>();
    //    for(int i = 0; i < nums.length; i++){
    //     map.put(nums[i], map.getOrDefault(nums[i],0)+1);
    //    }
       

    //    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->map.get(a)- map.get(b));
    //    for(int i : map.keySet()){
    //     pq.offer(i);
    //     if(pq.size() > k) pq.poll();
    //    }

    //    int arr[] = new int[k];
    //    for(int i = 0; i < k; i++){
    //     arr[i] = pq.poll();
    //    }
    //    return arr;

   Map<Integer, Integer> map = new HashMap<>();
   for(int i : nums){
    map.put(i, map.getOrDefault(i,0)+1);
   }

   PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> Integer.compare(a[1], b[1]));

      for(int i : map.keySet()){
        int f = map.get(i);
        int curr[] = {i, f};
        if(pq.size() < k){
            pq.offer(curr);
        }
        else if(f > pq.peek()[1]){
            pq.poll();
            pq.offer(curr);
        }
      }
      int curr[] = new int[k];
      for(int i= 0; i < k; i++){
        curr[i] = pq.poll()[0];
      }
      return curr;
    }
}
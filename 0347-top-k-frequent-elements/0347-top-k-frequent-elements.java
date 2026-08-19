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

   List<Integer> ls = new ArrayList<>(map.keySet());
   ls.sort((a,b)-> Integer.compare(map.get(b), map.get(a)));

    int an[] = new int[k];
    int j = 0;
    for(int i = 0; i < k; i++){
        an[i] = ls.get(i);
    }
    return an;
    }
}
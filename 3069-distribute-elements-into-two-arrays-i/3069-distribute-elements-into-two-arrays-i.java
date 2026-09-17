class Solution {
    public int[] resultArray(int[] nums) {
        
        Deque<Integer> st1 = new ArrayDeque<>();
        Deque<Integer> st2 = new ArrayDeque<>();

        if(nums.length == 1){
            return new int[]{nums[0]};
        }

        st1.addLast(nums[0]);
        st2.addLast(nums[1]);

        for(int i = 2; i < nums.length; i++){
            if(st1.getLast() > st2.getLast()){
                st1.addLast(nums[i]);
            }
            else{
                st2.addLast(nums[i]);
            }
        }
        int []arr = new int[nums.length];
        int i = 0;
         
                while(!st1.isEmpty()) arr[i++] = st1.pollFirst();
                while(!st2.isEmpty()) arr[i++] = st2.pollFirst();   
    
        return arr;
    }
}
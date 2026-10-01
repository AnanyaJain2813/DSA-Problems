class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        for(int i = min; i <= max; i++){
            ls.add(i);
        }
  
        for(int i : nums){
            if(ls.contains(i)){
                ls.remove(Integer.valueOf(i));
            }
        }
        return ls;
        
    }
}
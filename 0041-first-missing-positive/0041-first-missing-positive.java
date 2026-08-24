class Solution {
    public int firstMissingPositive(int[] nums) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        HashSet<Integer> st = new HashSet<>();
        for(int num : nums){
            st.add(num);
        }

        for(int i = 1; i <= (long)max+1; i++){
            if( !st.contains(i)){
                return i;
            }
        }
        return 1;
    }
}
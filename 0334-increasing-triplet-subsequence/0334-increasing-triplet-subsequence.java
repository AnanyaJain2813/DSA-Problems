class Solution {
    public boolean increasingTriplet(int[] nums) {

        int n = nums.length;
   
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++){
            if(nums[i] <= min1) min1 = nums[i];
            else if(nums[i] <= min2) min2 = nums[i];
            else return true;
        }
        return false;
    }
}
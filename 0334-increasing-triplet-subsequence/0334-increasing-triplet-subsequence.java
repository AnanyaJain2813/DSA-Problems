class Solution {
    public boolean increasingTriplet(int[] nums) {

        int n = nums.length;
   
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(nums[i] < min1){
                min1 = nums[i];
                min2 = min2;
                min3 = min2;
            }
            else if(nums[i] > min1 && nums[i] < min2){
                min2 = nums[i];
                min3 = min2;
            }
            else if(nums[i] > min1 && nums[i] > min2 ){
                min3 = nums[i];
            }
            if(min1 < min2 && min2 < min3) return true;
        }
        return false;
    }
}
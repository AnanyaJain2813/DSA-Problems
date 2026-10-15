class Solution {
    public int maxProduct(int[] nums) {

        int l = 0, sl = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= l){
                sl = l;
                l = nums[i];
            }
            else if(nums[i] > sl && nums[i] < l){
                sl = nums[i];
            }
        }
        return (l - 1) * (sl - 1);
    }
}
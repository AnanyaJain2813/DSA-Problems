class Solution {
    public int majorityElement(int[] nums) {
        int c = 1;
        int maj = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == maj) c++;
            else if(c == 0){
                maj = nums[i];
                c = 1;
            }
            else c--;
        }
        c = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == maj) c++;
        }
        if(c > (nums.length/2)) return maj;
        return -1;
    }
}
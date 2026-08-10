class Solution {
    public int[] productExceptSelf(int[] nums) {

        int []p = new int[nums.length];
        int []s = new int[nums.length];

        p[0] = 1;
        s[nums.length - 1] = 1;

        for(int i = 1; i < nums.length; i++){
            p[i] = p[i-1]*nums[i-1];
        }
        for(int j = nums.length - 2; j >= 0; j--){
            s[j] = s[j+1] * nums[j+1];
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = p[i]*s[i];
        }
        return nums;
    }
}
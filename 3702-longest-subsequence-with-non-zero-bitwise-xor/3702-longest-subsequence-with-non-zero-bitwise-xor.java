class Solution {
    public int longestSubsequence(int[] nums) {
        
        int ans = 0;
        boolean f = false;
        for(int i = 0; i < nums.length; i++){
            ans = nums[i] ^ ans;
           if(nums[i] != 0) f = true;
        }

        if(ans != 0) return nums.length;
        if(f) return nums.length - 1;
        else return 0;

    }
}
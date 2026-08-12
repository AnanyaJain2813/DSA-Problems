class Solution {
    public int longestSubarray(int[] nums) {

        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            int c0 = 0, c1 = 0;
            for(int j = i; j < nums.length; j++){
                if(nums[j] == 0) c0++;
                if(nums[j] == 1) c1++;

                if(c0 > 1) break;
            }
            if(c0 == 0) c1--;
             ans = Math.max(c1, ans);
        }
        return ans;
    }
}
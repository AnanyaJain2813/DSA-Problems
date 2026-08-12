class Solution {
    public int longestSubarray(int[] nums) {

        //int ans = 0;
        // for(int i = 0; i < nums.length; i++){
        //     int c0 = 0, c1 = 0;
        //     for(int j = i; j < nums.length; j++){
        //         if(nums[j] == 0) c0++;
        //         if(nums[j] == 1) c1++;

        //         if(c0 > 1) break;
        //     }
        //     if(c0 == 0) c1--;
        //      ans = Math.max(c1, ans);
        // }

        int i = 0, j = 0;
        int c0 = 0, ans = 0, max = 0;
        while(j < nums.length){
            if(nums[j] == 0) c0++;
            else if(nums[j] == 1) ans++;

            while(c0 > 1){
                ans = ans - nums[i];
                if(nums[i] == 0) c0--;
                i++;
            }
            max = Math.max(max, ans);
            j++;
        }
        if(c0 == 0) max = max-1;
        return max;
    }
}
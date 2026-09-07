class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        // int low = 0, high = 0;
        // int ans = Integer.MAX_VALUE;
        // int sum = 0;
        // while(high < nums.length){
        //     sum += nums[high];
        //     while(sum >= target){
        //         ans = Math.min(ans, high - low + 1);
        //         sum = sum - nums[low];
        //         low++;
        //     }
        //     high++;
        // }

        // if(ans == Integer.MAX_VALUE) return 0;
        // return ans;
        
        // int min = Integer.MAX_VALUE;
        // int j = 0;
        // int sum = 0;
        // for(int i = 0; i < nums.length; i++){
        //     sum += nums[i];
        //     while(sum >= target){
        //         min = Math.min(min, i - j + 1);
        //         sum = sum - nums[j];
        //         j++;
        //     }
        // }
        // if(min == Integer.MAX_VALUE) return 0;
        // return min;

        int ans = Integer.MAX_VALUE;
        int sum = 0;
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            sum += nums[j];
            while(sum >= target){
                ans = Math.min(ans, j - i + 1);
                sum = sum - nums[i];
                i++;
            }
        }
        if(ans == Integer.MAX_VALUE) return 0;
        return ans;
    }
}
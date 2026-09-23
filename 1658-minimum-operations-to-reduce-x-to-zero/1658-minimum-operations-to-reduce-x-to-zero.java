class Solution {
    public int minOperations(int[] nums, int x) {
        int cnt = 0, ans = Integer.MAX_VALUE;
        // Arrays.sort(nums);
        // int i = 0;
   
        // for(int j = 0; j < nums.length; j++){
        //     x = x - nums[j];
        //     cnt++;
        //     while(x < 0){
        //         x = x + nums[i];
        //         i++;
        //         cnt--;
        //     }
        //     if(x == 0){
        //         ans = Math.min(ans, cnt);
        //     }
        // }
        // if(ans == Integer.MAX_VALUE) return -1;
        // return ans;

     int sum = 0;
     for(int i : nums){
        sum = sum + i;
     }
     if(sum < x) return -1;
     sum = sum - x;
     if(sum == 0) return nums.length;
     
     int i = 0;
     int to = 0;
     int max = -1;
     for(int j = 0; j < nums.length; j++){
        to += nums[j];
        while(to > sum){
            to = to - nums[i];
            i++;
        }
        if(sum == to){
            max = Math.max(max , j - i + 1);
        }
     }
     return max == -1 ? -1 : nums.length - max;
    }
}
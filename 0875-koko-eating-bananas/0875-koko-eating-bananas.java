class Solution {
    // public static long ban(int[]nums, int h){
    //     long time = 0;
    //     for(int i = 0; i < nums.length; i++){
    //         time += (long)Math.ceil((double)nums[i]/(double)h);
    //     }
    //     return time;
    // }

    static long call(int nums[], int hr){
        long sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= hr){
                sum += 1;
            }
            else{
                long a = (long)Math.ceil((double)nums[i]/(double)hr);
                sum += a;
            }
        }
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {

        // int ans = 0;
        // int max = 0;
        // for(int i = 0; i < piles.length; i++){
        //     max = Math.max(max, piles[i]);
        // }
        // int low = 1, high = max;
        // while(low <= high){
        //     int mid = low + (high-low)/2;
        //     long time = ban(piles, mid);
        //     if(time > h){
        //         low = mid + 1;
        //     }
        //     else{
        //         ans = mid;
        //         high = mid - 1;
        //     }
        // }
        // return ans;

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < piles.length; i++){
            max = Math.max(piles[i], max);
        }

        int l = 1, high = max;
        int ans = Integer.MAX_VALUE;
        while(l <= high){
            int mid = (l + high)/2;
            long hr = call(piles, mid);
            if(hr <= h){
                ans = Math.min(mid, ans);
                high = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }

        return ans;
    }
}
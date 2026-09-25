class Solution {
    public static int bin(int[] nums, int target, boolean fl){
        int idx = -1;
        int l = 0, h = nums.length - 1;
        while(l <= h){
            int mid = (l + h)/2;
            if(nums[mid] == target){
                idx = mid;
                if(fl) l = mid+1;
                else h = mid-1;
            }
            else if(nums[mid] < target){
                l = mid + 1;
            }
            else h = mid - 1;
        }
        return idx;
    }
    public int[] searchRange(int[] nums, int target) {
        int []res = new int[2];
        int lef = bin(nums, target, false);
        int rig = bin(nums, target, true);
        res[0] = lef;
        res[1] = rig;
        return res;
    }
}
class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int []ps = new int[nums.length];
        int []ss = new int[nums.length];
        ps[0] = nums[0];
        ss[nums.length - 1] = nums[nums.length - 1];

        for(int i = 1; i < nums.length; i++){
            ps[i] = Math.max(ps[i-1], nums[i]);
        }
        
        for(int i = nums.length - 2; i >= 0; i--){
            ss[i] = Math.min(ss[i+1], nums[i]);
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < ps.length; i++){
            int sum = ps[i] - ss[i];
            if(sum <= k) return i;
        }
        return -1;
    }
}
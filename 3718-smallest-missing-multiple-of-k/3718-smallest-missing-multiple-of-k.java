class Solution {
    public int missingMultiple(int[] nums, int k) {

        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i < nums.length; i++){
        //     max = Math.max(nums[i], max);
        // }

        // for(int i = 1)

        Set<Integer> st = new HashSet<>();
        for(int i : nums){
            st.add(i);
        }

        int aa = k;
        int i = 1;
        while(st.contains(aa)){
            i++;
            aa = i*k;
        }
        return aa;
    }
}
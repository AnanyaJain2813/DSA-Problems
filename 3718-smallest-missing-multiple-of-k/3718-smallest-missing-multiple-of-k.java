class Solution {
    public int missingMultiple(int[] nums, int k) {

     

        Set<Integer> st = new HashSet<>();
        for(int i : nums){
            st.add(i);
        }

        int aa = k;
        while(st.contains(aa)){
            aa = aa + k;
        }
        return aa;
    }
}
class Solution {
    public int firstMissingPositive(int[] nums) {

        HashSet<Integer> st = new HashSet<>();
        for(int num : nums){
            if(num > 0) st.add(num);
        }

        int i = 1;
        while(st.contains(i)){
            i++;
        }
        return i;
    }
}
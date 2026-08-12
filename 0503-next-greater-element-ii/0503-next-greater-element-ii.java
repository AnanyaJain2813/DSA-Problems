class Solution {
    public int[] nextGreaterElements(int[] nums) {
        

        int []a = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            a[i] = -1;
            
            for(int j = 1; j < nums.length; j++){
                int b = (i + j) % nums.length;
                if(nums[b] > nums[i]){
                    a[i] = nums[b];
                    break;
                }
            }

        }
        return a;
    }
}
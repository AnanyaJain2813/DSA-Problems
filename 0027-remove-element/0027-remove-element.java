class Solution {
    public int removeElement(int[] nums, int val) {

        int []arr = new int[nums.length];

        int c = 0, j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val) continue;
            else{
                c++;
                arr[j] = nums[i];
                j++;
            }
        }
        int k = 0;
        for(int i : arr){
            nums[k++] = i;
        }
        return c;
    }
}
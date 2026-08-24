class Solution {
    public void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {

        int low = 0, high = nums.length - 1;
        int mid = 0;
        while(low <= mid && mid <= high){
            if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }
            else if(nums[mid]==1)  mid++;

            else{
                swap(nums, mid, low);
                low++;
                mid++;
            }
        }
        
    }
}
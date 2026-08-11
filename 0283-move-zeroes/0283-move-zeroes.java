class Solution {
    public void moveZeroes(int[] nums) {

    //     int j = 0;
    //    for(int i = 0; i < nums.length; i++){
    //     if(nums[i] == 0){
    //         j = i;
    //         break;
    //     }
    //    }
    //    for(int i = j+1; i < nums.length; i++){
    //     if(nums[i] != 0){
    //         int temp = nums[i];
    //         nums[i] = nums[j];
    //         nums[j] = temp;
    //         j++;
    //     }
    //    }

    // int i = 0, j = 0;
    // while(i < nums.length){
    //     if(nums[i] == 0){
    //         i++;
    //     }
    //     else{
    //         int temp = nums[i];
    //         nums[i] = nums[j];
    //         nums[j] = temp;
    //         j++;
    //         i++;
    //     }
    // }
    int []arr = new int[nums.length];
    int j =0;
    for(int i = 0; i < nums.length; i++){
        if(nums[i] != 0){
            arr[j] = nums[i];
            j++;
        }
    }
    j = 0;
    for(int i : arr){
        nums[j] = i;
        j++;
    }
    }
}
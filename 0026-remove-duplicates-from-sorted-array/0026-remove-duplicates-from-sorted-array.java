class Solution {
    public int removeDuplicates(int[] nums) {
      
       
    //    int cnt = 1;
    //    int i = 1;
    //    int j = 1;
    //    while(i < nums.length){
    //     if(nums[i] != nums[i-1]){
    //         cnt++;
    //         nums[j++] = nums[i];
    //     }
    //     i++;
    //    }
    //    return cnt;

    int cnt = 1;
    int k = 1;
    for(int i = 1; i < nums.length; i++){
        if(nums[i] != nums[i-1]){
            nums[k] = nums[i];
            k++;
            cnt++;
        }

    }
    return cnt;
    }
}
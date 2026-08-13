class Solution {
    public int longestOnes(int[] nums, int k) { 

    //  int max = 0, cnt = 0;
    //  int l = 0;
    //  for(int i = 0; i < nums.length; i++){
    //     if(nums[i] == 0) cnt++;

    //     while( l < nums.length && cnt > k){
    //         if(nums[l] == 0) cnt--;
    //         l++;
    //     }

    //     max = Math.max(max, i - l + 1);
    //  }
    //  return max;

    int max = 0, cnt0 = 0;
    int i = 0;
    for(int j = 0; j < nums.length; j++){
        if(nums[j] == 0) cnt0++;

        while(cnt0 > k){
            if(nums[i] == 0) cnt0--;
            i++;
        }

        max = Math.max(max, j - i + 1);
    }
    return max;
    }
}
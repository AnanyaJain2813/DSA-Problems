class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // List<List<Integer>> res = new ArrayList<>();
        // Arrays.sort(nums);

        // for (int i = 0; i < nums.length; i++) {
        //     if (i > 0 && nums[i] == nums[i-1]) {
        //         continue;
        //     }
            
        //     int j = i + 1;
        //     int k = nums.length - 1;

        //     while (j < k) {
        //         int total = nums[i] + nums[j] + nums[k];

        //         if (total > 0) {
        //             k--;
        //         } else if (total < 0) {
        //             j++;
        //         } else {
        //             res.add(Arrays.asList(nums[i], nums[j], nums[k]));
        //             j++;

        //             while (nums[j] == nums[j-1] && j < k) {
        //                 j++;
        //             }
        //         }
        //     }
        // }
        // return res;  

        Arrays.sort(nums);
        List<List<Integer>> ls = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int l = i+1, r = nums.length - 1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum < 0) l++;
                else if(sum > 0) r--;
                if(sum == 0){
                    ls.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while(l < nums.length && nums[l] == nums[l - 1]) l++;
                    while(r > i && nums[r] == nums[r + 1]) r--;
                }
            }
        }   
        return ls;   
    }
}
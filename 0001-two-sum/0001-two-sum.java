class Solution {
    public int[] twoSum(int[] nums, int target) {
        
       
        // int sum = 0;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i < n; i++){

        //     int rem = target - nums[i];
        //     if(map.containsKey(rem)){
        //         return new int[]{map.get(rem), i};
        //     }
        //         map.put(nums[i],i);
        // }
        // return new int[]{};

        // int n = nums.length;
        // int [][]a = new int[n][2];
        // for(int i = 0; i < n; i++){
        //     a[i][0] = nums[i];
        //     a[i][1] = i;
        // }
        // Arrays.sort(a, (b,c) -> Integer.compare(b[0], c[0]));

        // int i = 0, j = n - 1;
        // while( i < j){
        //     int sum = a[i][0] + a[j][0];
        //     if(sum == target){
        //         return new int[]{a[i][1], a[j][1]};
        //     }
        //     else if(sum > target){
        //         j--;
        //     }
        //     else{
        //         i++;
        //     }
        // }
        // return new int[]{-1,-1};

        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i+1; j < nums.length; j++){
                sum = nums[i] + nums[j];
                if(sum == target) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
            }
}
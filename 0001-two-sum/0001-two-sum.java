class Solution {
    public int[] twoSum(int[] nums, int target) {

        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int i = 0; i < nums.length; i++){
        //     int t = target - nums[i];
        //     if(map.containsKey(t)){
        //         int v = map.get(t);
        //         return new int[]{v,i};
        //     }
        //     map.put(nums[i],i);
        // }
        // return new int[]{-1,-1};
        int [][]arr = new int [nums.length][2];
        for(int i = 0; i < arr.length; i++){
            arr[i] = new int[]{nums[i], i};
        }

        Arrays.sort(arr, (a,b)->Integer.compare(a[0], b[0]));
        int i = 0, j = nums.length - 1;

        while( i < j){
            int sum = arr[i][0] + arr[j][0];
            if(sum == target){
                return new int[]{arr[i][1],arr[j][1]};
            }
            if(sum > target) j--;
            else i++;
        }
        return new int[]{-1,-1};
    }
}
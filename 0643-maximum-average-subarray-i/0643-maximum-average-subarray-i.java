class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        double max = (double)sum/k;

        int i = 0;
        for(int j = k; j < nums.length; j++){
            sum = sum - nums[i];
            i++;
            sum = sum + nums[j];
            double avg = (double)sum/k;

            max = Math.max(max,avg);
        }
        
        return max;
    }
}
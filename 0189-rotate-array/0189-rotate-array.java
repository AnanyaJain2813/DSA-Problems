class Solution {
    
    public static void swap(int []nums, int i, int n){
        while(i <= n){
            int temp = nums[i];
            nums[i] = nums[n];
            nums[n] = temp;
            i++;
            n--;
        }
    }
    public void rotate(int[] nums, int k) {
       int n = nums.length;
       int d = k % n;
       swap(nums, 0, n-1);
       swap(nums, 0, d-1);
       swap(nums, d, n-1);
     
    }
}
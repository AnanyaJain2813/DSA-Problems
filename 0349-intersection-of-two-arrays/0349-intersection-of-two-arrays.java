class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int []arr = new int[Math.min(nums1.length, nums2.length)];
        int i = 0, j = 0;
        int k = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                arr[k] = nums1[i];
                i++;
                j++;
                while(i < nums1.length && arr[k] == nums1[i]) i++;
                while(j < nums2.length && arr[k] == nums2[j]) j++;
                k++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums2[j] < nums1[i]) j++;
        }
        return Arrays.copyOf(arr, k);
    }
}
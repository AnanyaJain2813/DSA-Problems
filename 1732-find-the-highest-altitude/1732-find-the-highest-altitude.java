class Solution {
    public int largestAltitude(int[] gain) {

        int k[] = new int[gain.length+1];
        k[0] = 0;
        k[1] = gain[0];
        for(int i = 2; i < k.length; i++){
            k[i] = k[i - 1] + gain[i-1];
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < k.length; i++){
            max = Math.max(max, k[i]);
        }
        return max;
        
    }
}
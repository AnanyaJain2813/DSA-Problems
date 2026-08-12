class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // int x = 0, y = numbers.length - 1;
        // while( x < y){
        //     int sum = numbers[x] + numbers[y];
        //     if(sum == target){
        //         return new int[]{x + 1,y + 1};
        //     }
        //     else if(sum > target){
        //         y--;
        //     }
        //     else{
        //         x++;
        //     }
        // }
        // return new int[]{-1,-1};

        int i = 0, j = numbers.length - 1;
        while(i < j){
            int sum = numbers[i]+numbers[j];
            if(sum == target){
                return new int[]{i+1, j+1};
            }
            else if(sum < target) i++;
            else j--;
        }
        return new int[]{-1,-1};
    }
}
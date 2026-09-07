class Solution {
    void swap(int [][]nums, int i, int j){
        int temp = nums[i][j];
        nums[i][j] = nums[j][i];
        nums[j][i] = temp;
    }
    void reverse(int nums[][], int k, int i, int j){
        while(i <= j){
            int temp = nums[k][i];
            nums[k][i] = nums[k][j];
            nums[k][j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[][] matrix) {
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(j >= i){
                    swap(matrix, i, j);
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            reverse(matrix, i, 0, matrix[0].length - 1);
        }
    }
}
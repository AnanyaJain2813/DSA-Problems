class NumMatrix {

    private int[][]p;
    public NumMatrix(int[][] matrix) {

        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return;

        int n = matrix.length;
        int m = matrix[0].length;
        p = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int top = (i > 0)? p[i-1][j] : 0;
                int bot = (j > 0)? p[i][j-1] : 0;
                int tl =  (i > 0 && j > 0)? p[i-1][j-1] : 0;

                p[i][j] = matrix[i][j] + top + bot - tl;
            }
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
       int top =  (row1 > 0) ? p[row1 - 1][col2] : 0;
       int bot = (col1 > 0)  ? p[row2][col1 - 1] : 0;
       int tl =  (row1 > 0 && col1 > 0)? p[row1 - 1][col1 - 1]:0;

       return p[row2][col2] - top - bot + tl;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
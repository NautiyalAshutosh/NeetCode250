class NumMatrix {
    int[][] pre;
    public NumMatrix(int[][] matrix) {
        pre = new int[matrix.length][matrix[0].length];
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j< matrix[0].length; j++){
                int left = i > 0 ? pre[i-1][j] : 0;
                int above = j > 0 ? pre[i][j-1] : 0;
                int extra = i > 0 && j> 0 ? pre[i-1][j-1] : 0;
                pre[i][j] = matrix[i][j] + left + above - extra;
            }
        }
    
    }
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        int leftSide = col1 > 0 ? pre[row2][col1-1] : 0;
        int aboveSide = row1 > 0? pre[row1-1][col2] : 0;
        int doubleDeleted = row1 > 0 && col1 > 0 ? pre[row1-1][col1-1] : 0;
        sum += pre[row2][col2] - (leftSide + aboveSide) + doubleDeleted;
        return sum;
    }
}
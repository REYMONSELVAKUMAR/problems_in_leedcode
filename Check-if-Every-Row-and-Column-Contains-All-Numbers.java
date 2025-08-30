class Solution {
    public boolean checkValid(int[][] matrix) {
        int l=matrix.length;
        boolean[][] row=new boolean[l][l];
        boolean[][] col=new boolean[l][l];
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                int val=matrix[i][j]-1;
                if(row[i][val]||col[j][val]){
                    return false;
                }
                row[i][val]=col[j][val]=true;
            }
        }
        return true;
    }
}
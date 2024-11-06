class Solution {
    public int minFallingPathSum(int[][] m) {
        int l1=m.length-1;
        int l2=m[0].length-1;
        for(int i=1;i<=l1;i++){
            for(int j=0;j<=l2;j++){
                if(j==0&&j==l2){m[i][j]+=m[i-1][j];}
                else if(j==0){
                    m[i][j]+=Math.min(m[i-1][j],m[i-1][j+1]);
                }
                else if(j==l2){
                    m[i][j]+=Math.min(m[i-1][j],m[i-1][j-1]);
                }
                else
                m[i][j]+=Math.min(Math.min(m[i-1][j],m[i-1][j+1]),m[i-1][j-1]);
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=l2;i++){
                 min=Math.min(min,m[l1][i]);
        }
        return min;
    }
}
class Solution {
    public int minimumArea(int[][] grid) {
        int c1=0,c2=grid[0].length-1,r1=0,r2=grid.length-1,f1=0;
        for(int i=0;i<grid[0].length;i++){
            f1=0;
            for(int j=0;j<grid.length;j++){
                 if(grid[j][i]==1){
                    f1=1;
                    c1=i;
                   
                    break;
                   
                 }
            }
            if(f1==1)break;
        }
        for(int i=grid[0].length-1;i>-1;i--){
            f1=0;
            for(int j=0;j<grid.length;j++){
                 if(grid[j][i]==1){
                    f1=1;
                    c2=i;
                   
                    break;
                 }
            }
            if(f1==1)break;
        }
         for(int i=0;i<grid.length;i++){
            f1=0;
            for(int j=0;j<grid[0].length;j++){
                 if(grid[i][j]==1){
                    f1=1;
                    r1=i;
               
                    break;
                 }
            }
            if(f1==1)break;
        }
        for(int i=grid.length-1;i>-1;i--){
            f1=0;
            for(int j=0;j<grid[0].length;j++){
                 if(grid[i][j]==1){
                    f1=1;
                    r2=i;
                  
                    break;
                 }
            }
            if(f1==1)break;
        }
        return (c2-c1+1)*(r2-r1+1);
    }
}
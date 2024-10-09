class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        List<int[]>l=new ArrayList<>();
        int n=rows*cols,r=rStart,c=cStart,i=1;
        l.add(new int[]{r,c});
        while(l.size()<n){
               for(int a=i;a>0;a--){
                c++;
                if(c<cols&&c>-1&&r>-1&&r<rows){
                    l.add(new int[]{r,c});
                }
               }
               for(int a=i;a>0;a--){
                r++;
                if(c<cols&&c>-1&&r>-1&&r<rows){
                    l.add(new int[]{r,c});
                }
               }
               i++;
               for(int a=i;a>0;a--){
                c--;
                if(c<cols&&c>-1&&r>-1&&r<rows){
                    l.add(new int[]{r,c});
                }
               }
               for(int a=i;a>0;a--){
                r--;
                if(c<cols&&c>-1&&r>-1&&r<rows){
                    l.add(new int[]{r,c});
                }
               }
               i++;  
        }
        return l.toArray(new int[rows*cols][]);
    }
}
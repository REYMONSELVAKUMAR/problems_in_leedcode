class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
       int dis=Math.min(((p1[0]-p2[0])*(p1[0]-p2[0]))+((p1[1]-p2[1])*(p1[1]-p2[1])),((p1[0]-p3[0])*(p1[0]-p3[0]))+((p1[1]-p3[1])*(p1[1]-p3[1])));
       int max=Math.max(((p1[0]-p4[0])*(p1[0]-p4[0]))+((p1[1]-p4[1])*(p1[1]-p4[1])),Math.max(((p1[0]-p2[0])*(p1[0]-p2[0]))+((p1[1]-p2[1])*(p1[1]-p2[1])),((p1[0]-p3[0])*(p1[0]-p3[0]))+((p1[1]-p3[1])*(p1[1]-p3[1]))));
       int[][]arr=new int[4][2];
       arr[0]=p1;
       arr[1]=p2;
       arr[2]=p3;
       arr[3]=p4;
       int c1=0;
       int c2=0;
       for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            if(i==j)continue;
            int cdis=((arr[i][0]-arr[j][0])*(arr[i][0]-arr[j][0]))+((arr[i][1]-arr[j][1])*(arr[i][1]-arr[j][1]));
            if(dis==cdis)
                c1++;
            else if(cdis==max)c2++;
       }}
      
       return c1==8&&c2==4;
    }
}
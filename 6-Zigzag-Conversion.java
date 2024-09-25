class Solution {
    public String convert(String s, int numRows) {
        int l=s.length(),c=0,col=0,i=1,mc=0;
        if(numRows==1)return s;
        char[][] ans=new char[numRows][l/2+1];
        ans[0][0]=s.charAt(0);c++;
        while(c<l){
            for(i=1;i<numRows&&c<l;i++){
                ans[i][col]=s.charAt(c++);
            }
            i-=2;col++;
            for(;i>=0&&c<l;i--){
                mc=col;
                ans[i][col++]=s.charAt(c++);
            }
            col--;
        }
        StringBuilder sb= new StringBuilder();
        for(int rw=0;rw<numRows;rw++){
           for(int cw=0;cw<=col;cw++){
            if(ans[rw][cw]!='\u0000')sb.append(ans[rw][cw]);
           }
        }
        return sb.toString();
    }
}
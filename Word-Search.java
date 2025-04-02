class Solution {
    public boolean dfs(boolean[][] vis,int i,int j,int il,int jl,String s,char[][] board,int currPos){
            if(i<0||j<0||i>=il||j>=jl||vis[i][j]||board[i][j]!=s.charAt(currPos))
            return false;
            if(currPos==s.length()-1){
                return true;
            }
            vis[i][j]=true;
            boolean a=dfs(vis,i+1,j,il,jl,s,board,currPos+1);
            boolean b=dfs(vis,i-1,j,il,jl,s,board,currPos+1);
            boolean c=dfs(vis,i,j+1,il,jl,s,board,currPos+1);
            boolean d=dfs(vis,i,j-1,il,jl,s,board,currPos+1);
            vis[i][j]=false;
            return a||b||c||d;
        } 
    public boolean exist(char[][] board, String word) {
        int il=board.length,jl=board[0].length;
        for(int i=0;i<il;i++){
            for(int j=0;j<jl;j++){
                if(word.charAt(0)==board[i][j]){
                    boolean[][] vis=new boolean[il][jl];
                    if(dfs(vis,i,j,il,jl,word,board,0))
                    return true;
                }
            }
        }
        return false;
    }
}
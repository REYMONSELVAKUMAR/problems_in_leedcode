class Solution {
    public int minDistance(String a, String b) {
        int[][] dp=new int[a.length()+1][b.length()+1];
        for(int i=0;i<=b.length();i++){
            dp[0][i]=i;
        }
         for(int i=0;i<=a.length();i++){
            dp[i][0]=i;
        }
        for(int i=1;i<=a.length();i++){
            for(int j=1;j<b.length()+1;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i][j-1]))+1;
                }
            }
        }
        return dp[a.length()][b.length()];
    }
}
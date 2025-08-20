class Solution {
    public int countSquares(int[][] m) {
        int s = 0;
        for (int i = 0; i < m.length; i++) {
            s += m[i][0];
        }
        for (int i = 1; i < m[0].length; i++) {
            s += m[0][i];
        }
        for (int i = 1; i < m.length; i++) {
            for (int j = 1; j < m[0].length; j++) {
                if (m[i][j] == 1) {
                    m[i][j] = Math.min(Math.min(m[i - 1][j], m[i - 1][j - 1]), m[i][j - 1]) + 1;
                    s += m[i][j];
                }
            }
        }
        return s;
    }
}
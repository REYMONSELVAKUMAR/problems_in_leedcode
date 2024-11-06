class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int s, m = arr.length;
        int n = arr[0].length;
        if (arr[m - 1][n - 1] == 1 || arr[0][0] == 1)
            return 0;
        arr[0][0] = 1;
        for (int i = 1; i < m; i++) {
            if (arr[i][0] == 1) {
                arr[i][0] = 0;
            } else
                arr[i][0] = arr[i - 1][0];
        }
        for (int i = 1; i < n; i++) {
            if (arr[0][i] == 1) {
                arr[0][i] = 0;
            } else
                arr[0][i] = arr[0][i - 1];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 1) {
                    arr[i][j] = 0;
                    continue;
                }
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }
        return arr[m - 1][n - 1];

    }
}
class Solution {
    public int closedIsland(int[][] grid) {
       Queue<int[]> q = new LinkedList<>();
        int c = 0;
        int[][] visited = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int f=1;
                if (grid[i][j] ==0 && visited[i][j] == 0) {
                    q.add(new int[] { i, j });
                    visited[i][j] = 1;
                    while (!q.isEmpty()) {
                        int[] t = q.poll();
                        if (t[0] - 1 > -1 && grid[t[0] - 1][t[1]] == 0 && visited[t[0] - 1][t[1]] == 0) {
                            q.add(new int[] { t[0] - 1, t[1] });
                            visited[t[0] - 1][t[1]] = 1;
                        }
                        if (t[0] + 1 < grid.length && grid[t[0] + 1][t[1]] == 0 && visited[t[0] + 1][t[1]] == 0) {
                            q.add(new int[] { t[0] + 1, t[1] });
                            visited[t[0] + 1][t[1]] = 1;
                        }
                        if (t[1] - 1 > -1 && grid[t[0]][t[1] - 1] == 0 && visited[t[0]][t[1] - 1] == 0) {
                            q.add(new int[] { t[0], t[1] - 1 });
                            visited[t[0]][t[1] - 1] = 1;
                        }
                        if (t[1] + 1 < grid[0].length && grid[t[0]][t[1] + 1] ==0 && visited[t[0]][t[1] + 1] == 0) {
                            q.add(new int[] { t[0], t[1] + 1 });
                            visited[t[0]][t[1] + 1] = 1;
                        }
                        if(t[1] + 1 >= grid[0].length || t[1] - 1 <= -1 || t[0] - 1 <= -1 || t[0] + 1 >= grid.length)f=0;
                    }
                    c+=f;
                }
            }
        }
        return c;
    }
}
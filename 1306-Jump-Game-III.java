class Solution {
    public boolean canReach(int[] arr, int start) {
        int[] vis = new int[arr.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        vis[start] = 1;
        while (!q.isEmpty()) {
            int t = q.poll();
            int v1 = arr[t];
            if (v1 == 0) {
                return true;
            }
            if (t - v1 > -1 && vis[t - v1] == 0) {
                q.add(t - v1);
                vis[t - v1] = 1;
            }
            if (t + v1 < arr.length && vis[t + v1] == 0) {
                q.add(t + v1);
                vis[t + v1] = 1;
            }
        }
        return false;
    }
}
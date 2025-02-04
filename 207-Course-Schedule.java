class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] indeg = new int[numCourses];
        int cou = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++)
            adj.add(new ArrayList<Integer>());
        for (int[] t : prerequisites) {
            indeg[t[1]]++;
            adj.get(t[0]).add(t[1]);
        }
        for (int i = 0; i < numCourses; i++) {
            if (indeg[i] == 0) {
                q.offer(i);
            }
        }
        while (!q.isEmpty()) {
            int tem = q.poll();
            cou++;
            for (int t : adj.get(tem)) {
                if (--indeg[t] == 0) {
                    q.offer(t);
                }
            }
        }
        return cou == numCourses;
    }
}
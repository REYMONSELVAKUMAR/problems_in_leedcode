class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] indeg = new int[numCourses];
        int cou = 0,p=0;
        int[] ans=new int[numCourses];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++)
            adj.add(new ArrayList<Integer>());
        for (int[] t : prerequisites) {
            indeg[t[0]]++;
            adj.get(t[1]).add(t[0]);
        }
        for (int i = 0; i < numCourses; i++) {
            if (indeg[i] == 0) {
                q.offer(i);
            }
        }
        while (!q.isEmpty()) {
            int tem = q.poll();
            ans[p++]=tem;
            cou++;
            for (int t : adj.get(tem)) {
                if (--indeg[t] == 0) {
                    q.offer(t);
                }
            }
        }
       if(cou==numCourses)
        return ans;
        return new int[0];
        
    }
}

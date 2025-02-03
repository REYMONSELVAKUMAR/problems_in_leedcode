class Solution {
    public List<Integer> filterRestaurants(int[][] res, int veg, int maxp, int maxd) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> {
            if (b[1] != a[1])
                return b[1] - a[1];
            else {
                return b[0] - a[0];
            }
        });
        ArrayList<Integer> l = new ArrayList<>();
        if (veg == 0) {
            for (int[] r : res) {
                if (r[3] <= maxp && r[4] <= maxd) {
                    q.add(r);
                }
            }
        } else {
            for (int[] r : res) {
                if (r[2] == veg && r[3] <= maxp && r[4] <= maxd) {
                    q.add(r);
                }
            }
        }
        while (!q.isEmpty()) {
            int[] arr = q.poll();
            l.add(arr[0]);
        }
        return l;
    }
}
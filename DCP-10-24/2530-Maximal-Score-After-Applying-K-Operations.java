class Solution {
    public long maxKelements(int[] nums, int k) {
         long ans=0;
         PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->Integer.compare(b,a));
         for(int i:nums){
            q.add(i);
         }
         for(int i=0;i<k;i++){
            int c=q.poll();
            ans+=c;
            q.add((c+2)/3);
         }
         return ans;
    }
}
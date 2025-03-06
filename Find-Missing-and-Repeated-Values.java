class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer>s=new HashSet<>();
        int count=0,dup=0;
        for(int[] i:grid){
            for(int j:i){
                if(!s.add(j)){
                    dup=j;
                }
                count+=j;
            }
        }
        count-=dup;
        int[] ans=new int[2];
        ans[0]=dup;
        dup=grid.length*grid.length;
        ans[1]=((dup*(dup+1))/2)-count;
        return ans;
    }
}
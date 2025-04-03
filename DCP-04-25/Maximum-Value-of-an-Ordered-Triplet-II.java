class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans=0,maxDiff=0,maxA=0;
        for(int a:nums){
            ans=Math.max(ans,maxDiff*a);
            maxDiff=Math.max(maxDiff,maxA-a);
            maxA=Math.max(maxA,a);
            
        }
        return ans;
    }
}
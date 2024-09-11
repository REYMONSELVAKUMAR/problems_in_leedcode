class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[]l=new long[nums.length];
        int max=nums[0];
        l[0]=nums[0]*2;
        for(int i=1;i<nums.length;i++){
            if(max<nums[i])max=nums[i];
            l[i]=nums[i]+max+l[i-1];
        }
        return l;
    }
}
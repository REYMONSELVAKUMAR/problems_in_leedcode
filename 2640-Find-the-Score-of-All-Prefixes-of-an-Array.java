class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[]l=new long[nums.length];
        long a=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i])max=nums[i];
            a=a+nums[i]+max;
            l[i]=a;
        }
        return l;
    }
}
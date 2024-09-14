class Solution {
    public int longestSubarray(int[] nums) {
        int max=0,c=0,m=0;
        for(int i:nums){
            if(max<i)max=i;
        }
        for(int i:nums){
            if(i==max)c++;
            else c=0;
            if(c>m)m=c;
        }
        return m;

    }
}
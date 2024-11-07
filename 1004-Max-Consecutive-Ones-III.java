class Solution {
    public int longestOnes(int[] nums, int k) {
           int z=0,l=0,r=0,m=0;
           while(r<nums.length){
            if(nums[r]==0)z++;
            if(z>k){
                if(nums[l]==0)z--;
                l++;
            }
            if(z<=k){
                m=Math.max(m,r-l+1);
            }
            r++;
           }
           return m;
    }
}
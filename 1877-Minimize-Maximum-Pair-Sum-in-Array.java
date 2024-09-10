class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int m=0;
        for(int i=0,j=nums.length-1;i<j;i++,j--){
              if(m<nums[i]+nums[j]){
                m=nums[i]+nums[j];
              }
        }
        return m;
    }
}
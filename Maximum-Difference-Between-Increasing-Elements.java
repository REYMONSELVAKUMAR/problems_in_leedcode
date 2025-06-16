class Solution {
    public int maximumDifference(int[] nums) {
        int min=nums[0];
        int max=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            else{
                max=Math.max(max,nums[i]-min);
            }
        }
        return (max==0)?-1:max;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        int i,j;
        for(i=1;i<nums.length;i++){
             for(j=i;j<nums.length;j++){
                if(nums[j]+nums[j-i]==target){
                    arr[0]=j;
                    arr[1]=j-i;
                     return arr;
                }
             }
        }
        return arr;}
    
}
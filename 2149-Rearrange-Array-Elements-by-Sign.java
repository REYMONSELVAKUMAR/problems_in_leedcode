class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[]ar=new int[nums.length];
        int a=0,b=1;
        for(int i=0;i<nums.length;i++){
              if(nums[i]>0){
                ar[a]=nums[i];
                a+=2;
            }
            else{
                ar[b]=nums[i];
                b+=2;
        }}
        return ar;
    }
}

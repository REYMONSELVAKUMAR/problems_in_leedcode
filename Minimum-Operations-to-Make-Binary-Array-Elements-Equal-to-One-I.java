class Solution {
    public int minOperations(int[] nums) {
        int l=0,c=0;
        while(l<nums.length-2){
            if(nums[l]==0){
                c++;
                for(int i=l;i<l+3;i++){
                    if(nums[i]==0){
                        nums[i]=1;
                    }
                    else{
                        nums[i]=0;
                    }
                }
            }
            l++;
        }
       if(nums[nums.length-1]==0||nums[nums.length-2]==0){
        return -1;
       }
       return c;
    }
}
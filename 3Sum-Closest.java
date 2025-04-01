class Solution {
    public int threeSumClosest(int[] nums, int tar) {
        Arrays.sort(nums);
        int absmax=Integer.MAX_VALUE,res=0;
        for(int i=0;i<nums.length-2;i++){
            int j=i+1,k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==tar)return sum;
                int cur=Math.abs(tar-sum);
                if(cur<absmax){
                    absmax=cur;
                    res=sum;
                }
                if(sum>tar)k--;
                else j++;
            }
        }
        return res;
    }
}
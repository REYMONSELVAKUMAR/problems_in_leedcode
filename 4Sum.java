class Solution {
    public List<List<Integer>> fourSum(int[] nums, int tar) {
        Arrays.sort(nums);
        List<List<Integer>>li=new ArrayList<>();
        for(int i=0;i<nums.length-3;i++){
           if(i>0&&nums[i-1]==nums[i])continue;
           for(int j=i+1;j<nums.length-2;j++){
            if(j>i+1&&nums[j]==nums[j-1])continue;
            int k=j+1,l=nums.length-1;
            while(k<l){
                long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                if(sum==tar){
                    li.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                    while(k<l&&nums[k]==nums[k+1])k++;
                    k++;
                    l--;
                }
                else if(sum>tar)l--;
                else k++;
            }
           }
        }
        return li;
    }
}
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer>low=new ArrayList<Integer>();
        ArrayList<Integer>high=new ArrayList<Integer>();
        int pivCount=0;
        for(int i:nums){
            if(i<pivot){
                low.add(i);
            }
            else if(i>pivot){
                high.add(i);
            }
            else{
                pivCount++;
            }
        }
        int p=0;
        for(int i:low){
            nums[p++]=i;
        }
        while(pivCount-->0){
            nums[p++]=pivot;
        }
        for(int i:high){
            nums[p++]=i;
        }
        return nums;
    }
}
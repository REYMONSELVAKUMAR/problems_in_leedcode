class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int c,t,n = (int) (nums.length / 3);
        for (int i = 0; i < nums.length;) {
            c = 0;
            t=nums[i];
            while(i<nums.length&&t==nums[i]){
                c++;i++;
            }
            if(c>n)ans.add(t);   
        }
        return ans;
    }
}
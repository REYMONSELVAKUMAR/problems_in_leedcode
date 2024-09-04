class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> b1=new ArrayList<>();
        a1.add(nums[0]);
        b1.add(nums[1]);
        int c=1;
        for(int i=2;i<nums.length;i++){
            int a,b;
            a=a1.get(a1.size()-1);
            b=b1.get(b1.size()-1);
            if(a>b){
                a1.add(nums[i]);
                nums[c++]=nums[i];
                
            }
            else{
                 b1.add(nums[i]);
                
            }
        }
        for(int d=0;c<nums.length;d++){
            nums[c++]=b1.get(d);
        }
        return nums;
        }
}
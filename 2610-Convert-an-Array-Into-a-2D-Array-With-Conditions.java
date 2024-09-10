class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
         ArrayList<List<Integer>>l =new ArrayList<>();
         l.add(new ArrayList<Integer>());
         int c=0,f=0;
         for(int i=0;i<nums.length;i++){
            f=0;
           for(int j=0;j<=c;j++){
                 if(!(l.get(j).contains(nums[i]))){
                    f=1;
                    l.get(j).add(nums[i]);
                    break;
                 }
           }
           if(f==0){
            c++;
            l.add(new ArrayList<Integer>());
            l.get(c).add(nums[i]);
           }
         }
         return l;
    }
}
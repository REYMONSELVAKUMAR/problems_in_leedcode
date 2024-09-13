class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] a = nums.clone();
        int co = 0;
        int[] b=new int[nums.length];
        if (a[0] == 0) {
                a[0] = 1;
                b[0]=1;
                co++;
            }
        else b[0]=a[0];
        for (int i = 1; i < nums.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
                co++;
            }
            b[i]=a[i]*b[i-1];
        }
        int[] c=new int[nums.length];
        if(co>1)return c;
        else if(co==1){
        for(int i=0;i< nums.length;i++){
            if(nums[i]==0){
                  c[i]=b[ nums.length-1];
                  return c;
            }
        }}
        for(int i=0;i< nums.length;i++){
                c[i]=b[nums.length-1]/nums[i];

        }
        return c;
    }
}
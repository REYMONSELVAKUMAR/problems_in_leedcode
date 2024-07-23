class Solution {
    public int[] frequencySort(int[] nums) {
        int[] arr = new int[201];
        int c=0;
        for (int i : nums) {
            arr[i + 100]++;
            if(arr[i + 100]==1)c++;
        }
        int[]a1=new int[c];
        int[]a2=new int[c];
        int l=0;
        for(int i=0;i<201;i++){
            if(arr[i]>0){
                a1[l]=i-100;
                a2[l]=arr[i];
                l++;
            }
        }
        for(int z=0;z<c;z++){
            System.out.println(a1[z]+" "+a2[z]);
        }
        int tem1,tem2,m,k;
        for(m=c-1;m>0;m--){
            for(k=m-1;k>=0;k--){
                if(a2[k]>a2[m]||(a2[k]==a2[m]&&a1[k]<a1[m])){
                    tem1=a2[k];
                    tem2=a1[k];
                    a2[k]=a2[m];
                    a2[m]=tem1;
                    a1[k]=a1[m];
                    a1[m]=tem2;
                }
            }
        }
        int g=0;
        for(k=0;k<c;k++){
            while(a2[k]>0){
              nums[g]=a1[k];
              a2[k]--;
              g++;
            }
        }
        return nums;
    }
}
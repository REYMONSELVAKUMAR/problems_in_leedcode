class Solution {
    public int findKthPositive(int[] arr, int k) {
        int c=0,i=1,j=0;
        for(j=0;j<arr.length;){
               if(arr[j]==i){
               i++;
               j++;
           }
           else{
              k--;
              if(k==0)return i;
              i++;
           }
        }
        return (i-1)+k;
    }
}
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] a=new int[arr.length];
        int[] b=new int[queries.length];
         a[0]=arr[0];System.out.println(a[0]);
        for(int i=1;i<arr.length;i++){
             a[i]=arr[i]^a[i-1];
        }
        for(int i=0;i<queries.length;i++){
            if(queries[i][0]==0)b[i]=a[queries[i][1]];
            else
            b[i]=a[queries[i][1]]^a[queries[i][0]-1];
        }
        return b;
    }
}
class Solution {
    public int reverse(int x) {
        int a,j,k,s=0;
        a=x;
        long  i=0;
        if(x<0){
        s=1;
        a=a*-1;}

        while(a>0){
            j=a%10;
            i=i*10+j;
            a=a/10;
        }
        if(s==1){
            i=i*-1;
        }
         if (i > Integer.MAX_VALUE ||i<Integer.MIN_VALUE) {
            return 0;}
        return (int)i;
    }
}
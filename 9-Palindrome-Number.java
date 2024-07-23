class Solution {
    public boolean isPalindrome(int x) {
           int a,j,i=0,k;
           a=x;
            while(a>0){
            j=a%10;
            i=i*10+j;
            a=a/10;

        }
        if(x==i)
        return true;
        else
        return false; 
    }
}
class Solution {
    public int minSteps(int n) {
       int s=0,i=2;
       while(n>1){
          while(n%i==0){
            s+=i;
            n/=i;  
       }
       i++;
       }
       return s;
    }
}
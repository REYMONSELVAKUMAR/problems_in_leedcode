class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int s=0,rs=0,x=0,l=rolls.length+n;
        for(int i=0;i<rolls.length;i++){
            s+=rolls[i];
        }
         x=(mean*l)-s;
         if(x<=(n*6)&&(x>0)){
            int []r=new int[n];
            Arrays.fill(r,1);
            x-=n;
            if(x==0)return r;
            for(int i=0;i<n;i++){
                if(x>5){
                    r[i]=6;
                    x-=5;
                }
                else if(x>0){
                    r[i]+=x;
                    return r;
                }
                else break;
            }
         }
            return new int[0];
      
    }
}
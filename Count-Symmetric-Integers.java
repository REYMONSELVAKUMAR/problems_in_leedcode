class Solution {
    public int countSymmetricIntegers(int low, int high) {
            int c=0;int tot,t;
            for(int i=low;i<=high;i++){
                int s=0,val=i;
                tot=0;
                while(val>0){
                    s+=(val%10);
                    val/=10;
                    tot++;
                }
                int s2=0;
                val=i;
                t=0;
                if(s%2==0&&tot%2==0){
                    s/=2;
                    while(val>0){
                        s2+=(val%10);
                        val/=10;
                        t++;
                        if(s2==s&&t==(tot/2)){
                            c++;
                            break;
                        }
                    }

                }
                
            }  
            return c;
    }
}
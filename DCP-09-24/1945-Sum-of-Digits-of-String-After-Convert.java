class Solution {
    public int getLucky(String s, int k) {
        int sum=0,c;
        for(int i=0;i<s.length();i++){
            c=s.charAt(i)-96;
            while(c>0){
                sum+=c%10;
                c/=10;
            } 
        }
        k--;
        int s1=sum;
        while(k>0&&s1>9){
              sum=s1;
              s1=0;
           while(sum>0){
                s1+=sum%10;
                sum/=10;
            }  
            k--;   
        }
        return s1;
    }
}
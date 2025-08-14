class Solution {
    public String largestGoodInteger(String num) {
        char[] arr=num.toCharArray();
        boolean valid=false;
        char ans=' ';
        for(int i=0;i<num.length()-2;){
            int c=0;
            if(arr[i]==arr[i+1]){
                c+=2;
                if(arr[i]==arr[i+2]){
                c++;
                if(ans<arr[i]){
                    ans=arr[i];
                    valid=true;
                }
                i+=c;
                continue;
            }
        }
        i++;
        }
        if(valid){
            String a=String.valueOf(ans);
            a=a+a+a;
            return a;
        }
        return "";
    }
}
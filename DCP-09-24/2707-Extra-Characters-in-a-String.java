class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> li=new HashSet(Arrays.asList(dictionary));
        int[] a=new int[s.length()+1];
        a[0]=0;
        for(int i=1;i<=s.length();i++){
            a[i]=a[i-1]+1;
            for(int j=0;j<i;j++){
                String sb=s.substring(j,i);
                    if(li.contains(sb)){
                        a[i]=Math.min(a[i],a[j]);
                    }
            }
        }
        return a[s.length()];
    }
}
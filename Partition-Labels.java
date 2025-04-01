class Solution {
    public List<Integer> partitionLabels(String s) {
        ArrayList<Integer>l=new ArrayList<>();
        int[] li=new int[26];
        for(char a='a';a<='z';a++){
            li[a-'a']=s.lastIndexOf(String.valueOf(a));
        }
        for(int i=0;i<s.length();){
            int max=li[s.charAt(i)-'a'];
            for(int j=i;j<=max;j++){
                if(max<li[s.charAt(j)-'a']){
                    max=li[s.charAt(j)-'a'];
                }
            }
            
            l.add(max-i+1);
            i=max+1;
        }
        return l;
    }
}
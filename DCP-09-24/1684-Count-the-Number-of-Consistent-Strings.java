class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0;
        for(String s:words){
                for(char ch:allowed.toCharArray()){
                   s=s.replace(String.valueOf(ch),"");
                }
                if(s.equals("")){
                    c++;
                }
        }
        return c;
    }
}
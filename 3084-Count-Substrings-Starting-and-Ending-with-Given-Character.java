class Solution {
    public long countSubstrings(String s, char c) {
        long ct=0,ans=0;
        for(char ch:s.toCharArray()){
            if(ch==c){
            ct++;
            ans+=ct;
            }
        }
        return ans;
    }
}
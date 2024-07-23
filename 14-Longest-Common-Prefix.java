class Solution {
    public String longestCommonPrefix(String[] strs) {
     int i,j,len=strs.length;
     int si=strs[0].length();
     for(i=0;i<si;i++){
         for(j=1;j<len;j++){
if(i==strs[j].length() ||strs[j].charAt(i)!=strs[0].charAt(i)){
    return strs[0].substring(0,i);
}
         }
     }
   return strs[0]; }
}
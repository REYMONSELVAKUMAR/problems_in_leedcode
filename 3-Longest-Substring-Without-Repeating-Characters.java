class Solution {
    public int lengthOfLongestSubstring(String s) {
    HashMap<Character,Integer> m=new HashMap<>();
    char[] c=s.toCharArray();
    int st=0,mx=0;
    for(int i=0;i<c.length;i++){
        if(m.containsKey(c[i])&&st<=m.get(c[i])){
          st=m.get(c[i])+1;
        }
        m.put(c[i],i);
        mx=Math.max(mx,i-st+1);
    }
    return mx;
    }
}
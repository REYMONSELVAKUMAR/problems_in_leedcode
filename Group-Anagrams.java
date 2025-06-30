class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
           Map<String,List<String>>m=new HashMap<>();
           for(String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String n=new String(c);
           List<String>a= m.getOrDefault(n,new ArrayList<String>());
           a.add(s);
           m.put(n,a);
           }
           return new ArrayList<>(m.values());
    }
}
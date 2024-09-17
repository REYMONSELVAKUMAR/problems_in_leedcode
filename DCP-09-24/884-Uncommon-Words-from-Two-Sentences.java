class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
       String[] s11=s1.split(" ");
       String[] s22=s2.split(" ");
        HashMap<String,Integer> hm=new HashMap<>();
        for(String a:s11){
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        for(String b:s22){
            hm.put(b,hm.getOrDefault(b,0)+1);
        }
        ArrayList<String> l=new ArrayList<String>();
        for(Map.Entry<String,Integer> m:hm.entrySet()){
            if(m.getValue()==1){
                l.add(m.getKey());
            }
        }
        return l.toArray(new String[l.size()]);
    }
}
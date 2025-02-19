class Solution {
    Set<String> s = new TreeSet<>();
    String str="";
    int tot=0;
    boolean b=true;
    public void fun(StringBuilder sb, int c, int l) {
        if (c > l)
            return;
        if (c == l) {    
            s.add(sb.toString());
            if(s.size()==tot){
                str=sb.toString();
                b=!b;
            }
        }
        for (char cha='a'; cha <'d'&&b; cha++) {
                if (sb.length()==0||sb.charAt(sb.length() - 1) != cha) {
                    sb.append(cha);
                    fun(sb, c + 1, l);
                    sb.setLength(sb.length() - 1);
                }
            }
    }
    public String getHappyString(int n, int k) {
        tot=k;
        fun(new StringBuilder(),0,n);
        return str;
    }
}
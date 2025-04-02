class Solution {
    public List<String> letterCombinations(String digits) {
        String[] s=new String[10];
        s[2]=\abc\;
        s[3]=\def\;
        s[4]=\ghi\;
        s[5]=\jkl\;
        s[6]=\mno\;
        s[7]=\pqrs\;
        s[8]=\tvu\;
        s[9]=\wxyz\;
        List<String>l=new ArrayList<>();
        if(digits.length()!=0)
        bt(0,digits,\\,s,l);
        return l;
    }
    public void bt(int cp,String digits,String currStr,String[] s,List<String> l){
        if(currStr.length()==digits.length()){
            l.add(currStr);
            return;
        }
        for(char c:s[(int)(digits.charAt(cp)-'0')].toCharArray()){
            bt(cp+1,digits,currStr+c,s,l);
        }
    }
}
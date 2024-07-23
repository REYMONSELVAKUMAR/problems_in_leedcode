class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
        st.push(s.charAt(i));
        continue;
       }
       else if(st.isEmpty())
       return false;
       char a,b;
       a=s.charAt(i);
       switch (a){
       case ')':
       b=st.pop();
       if(b=='{'||b=='[')
       return false;
       break;
       case ']':
       b=st.pop();
       if(b=='{'||b=='(')
       return false;
       break;
       case '}':
       b=st.pop();
       if(b=='('||b=='[')
       return false;
       break;
       }}
       return st.isEmpty();
    }
}
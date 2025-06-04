class Solution {
    public String answerString(String word, int numFriends) {
        String ans="",tem;
        if(numFriends==1)return word;
         int len=word.length()-numFriends+1;
        for(int i=0;i<word.length();i++){
              tem=word.substring(i,Math.min(word.length(),i+len));
            if(tem.compareTo(ans)>0){
                ans=tem;
            }
        }
        return ans;
    }
}
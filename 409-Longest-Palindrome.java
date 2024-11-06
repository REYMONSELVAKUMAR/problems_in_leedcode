class Solution {
    public int longestPalindrome(String s) {
           Long bit=0L;
           for(char c:s.toCharArray())bit^=(1L<<(c-97));
           int co=Long.bitCount(bit);
           return s.length()-(co>1?co-1:0);    
    }
}

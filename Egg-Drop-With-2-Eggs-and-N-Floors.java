class Solution {
    public int twoEggDrop(int n) {
        int l=0,r=n;
        int ans=n;
        while(l<=r){
            int mid=(l+r)/2;
            if((mid*(mid+1))/2>=n){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}
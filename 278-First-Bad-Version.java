/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(isBadVersion(1)==true)return 1;
        int i=1,j=n,mid,f=1;
        while(i<=j){
            mid=i+(j-i)/2;
            if(isBadVersion(mid)){
                f=mid;
                j=mid-1;
            }
            else i=mid+1;
        }
        return f;
    }
}
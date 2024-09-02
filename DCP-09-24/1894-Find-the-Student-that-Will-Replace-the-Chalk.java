class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long s=0;
        for(int i=0;i<chalk.length;i++)s+=chalk[i];
        k=(int)(k%s);
        for(int i=0;i<chalk.length;i++){
            if(chalk[i]<=k){
                k-=chalk[i];
            }
            else return i;
        }
        return 0;
    }
}
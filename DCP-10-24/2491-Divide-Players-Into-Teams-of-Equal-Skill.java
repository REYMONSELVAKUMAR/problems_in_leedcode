class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int e=skill[0]+skill[skill.length-1];
        long t=0;
        for(int i=0,j=skill.length-1;i<j;i++,j--){
            if(skill[i]+skill[j]!=e)return -1;
            t=t+(skill[i]*skill[j]);
        }
        return t;
    }
}
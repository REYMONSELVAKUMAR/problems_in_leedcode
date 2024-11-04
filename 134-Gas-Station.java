class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gs=Arrays.stream(gas).sum();
        int cs=Arrays.stream(cost).sum();
        if(gs-cs<0)return -1;
        int bal=0,a=0;
        for(int i=0;i<gas.length;i++){
            bal+=(gas[i]-cost[i]);
            if(bal<0){
                bal=0;
                a=i+1;
            }
        }
        return a;
    }
}
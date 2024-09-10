class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int c=0,t=0;
        for(int i=0;i<costs.length;i++){
            if(t+costs[i]<=coins){
                t+=costs[i];
                c++;
            }
            else{
               return c;
            }
        }
        return c;
    }
}
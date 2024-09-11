class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int s=0,c=capacity;
        for(int i=0;i<plants.length;i++){
            if(plants[i]<=c){
                s++;
                c-=plants[i];
            }
            else{
                s+=(i*2)+1;
                c=capacity;
                c-=plants[i];
            }
        }
         return s;
    }
}
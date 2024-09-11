class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int s=plants.length,c=capacity;
        for(int i=0;i<plants.length;i++){
            if(plants[i]>c){
                s+=(i*2);
                c=capacity;
            }
            c-=plants[i];
        }
         return s;
    }
}
class Solution {
    public int[] frequencySort(int[] nums){
    Map<Integer,TreeSet<Integer>>map=new TreeMap<>();
        int[] a=new int[201];
        for(int i:nums){
            a[i+100]++;
        }
         for(int i:nums){
            TreeSet<Integer> li=map.getOrDefault(a[100+i],new TreeSet<Integer>());
            li.add(i);
            map.put(a[100+i],li); 
        }
        int j=0;
        for(int i:map.keySet()){
            TreeSet<Integer> h=map.get(i);
            while(!h.isEmpty()){
                int k=0;
                int e=h.pollLast();
                 while(k++<i){
                nums[j++]=e;
            }
            }
        }
        return nums;
    }
}
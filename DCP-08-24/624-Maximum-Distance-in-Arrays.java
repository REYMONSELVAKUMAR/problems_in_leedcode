class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
      int md=0,f,i,l,min=arrays.get(0).get(0),
      max=arrays.get(0).get(arrays.get(0).size()-1);
      for(i=1;i<arrays.size();i++){
        f=arrays.get(i).get(0);
        l=arrays.get(i).get(arrays.get(i).size()-1);
        md=Math.max(md,Math.max(max-f,l-min));
        min=Math.min(min,f);
        max=Math.max(max,l);
      }
      return md;
    }
}
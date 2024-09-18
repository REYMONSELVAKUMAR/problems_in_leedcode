class Solution {
    public String largestNumber(int[] nums) {
        ArrayList<String> l = new ArrayList<>();
        for (int i : nums) {
            l.add(String.valueOf(i));
        }
        l.sort((x, y) -> (y + x).compareTo(x + y));
        if (l.get(0).equals(\0\))
            return \0\;
        StringBuilder sb = new StringBuilder();
        for (String i : l) {
            sb.append(i);
        }
        return sb.toString();
    }
}
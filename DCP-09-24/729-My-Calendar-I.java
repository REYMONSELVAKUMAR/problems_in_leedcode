class MyCalendar {
    ArrayList<int[]> al = new ArrayList<>();
    public MyCalendar() {    
    }
    public boolean book(int start, int end) {
        for (int[] i : al) {
            if (i[1] > start && i[0] < end)
                return false;
        }
        al.add(new int[] { start, end });
        return true;
    }
}
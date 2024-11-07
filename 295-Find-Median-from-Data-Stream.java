class MedianFinder {
    PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;
    boolean even;
    public MedianFinder() {    
        min=new PriorityQueue<>();
        max=new PriorityQueue<>(Collections.reverseOrder());
        even =true;
    }
    public void addNum(int num) {
        if(even){
            max.add(num);
            min.add(max.poll());
        }
        else{
            min.add(num);
            max.add(min.poll());
        }
        even=!even;
    }
    
    public double findMedian() {
        if(even)return (max.peek()+min.peek())/2.0;
        return min.peek();
    }
}

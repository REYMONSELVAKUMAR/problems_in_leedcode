class MinStack {
    Stack<Integer> s = new Stack<>();
    int m = Integer.MAX_VALUE;

    public MinStack() {
    }

    public void push(int val) {
        if (val <= m) {
            s.push(m);
            m = val;
        }
        s.push(val);
    }

    public void pop() {
        if (s.pop() == m)
            m = s.pop();
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return m;
    }
}

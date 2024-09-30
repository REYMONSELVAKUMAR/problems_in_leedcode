class CustomStack {
    int[] arr;
    int p, m;

    public CustomStack(int maxSize) {
        arr = new int[maxSize];
        p = -1;
        m = maxSize;
    }

    public void push(int x) {
        if (p + 1 < m)
            arr[++p] = x;
    }

    public int pop() {
        if (p >= 0)
            return arr[p--];
        return -1;
    }

    public void increment(int k, int val) {
        if (k <= p)
            for (int i = 0; i < k; i++)
                arr[i] += val;
        
        else {
            for (int i = 0; i <= p; i++)
                arr[i] += val;
        }
    }
}

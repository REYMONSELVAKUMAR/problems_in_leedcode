class MyCircularDeque {
     int[] arr;
     int f,r,c;
    public MyCircularDeque(int k) {
        arr=new int[k];
        f=-1;
        r=-1;
        c=k;
    }
    
    public boolean insertFront(int value) {
        if(isFull())return false;
        if(isEmpty())f=r=0;
        else f=(f-1+c)%c;
        arr[f]=value;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull())return false;
        if(isEmpty())f=r=0;
        else r=(r+1)%c;
        arr[r]=value;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty())return false;
        if(f==r)f=r=-1;
        else f=(f+1)%(c);
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty())return false;
        if(f==r)f=r=-1;
        else r=(r-1+c)%c;
        return true;
    }
    
    public int getFront() {
        if(isEmpty())return -1;
        return arr[f];
    }
    
    public int getRear() {
        if(isEmpty())return -1;
        return arr[r];
    }
    
    public boolean isEmpty() {
        return f==-1;
    }
    
    public boolean isFull() {
        return ((f-1+c)%c)==r;
        //return ((f-1+c)%c)==r;
    }
}

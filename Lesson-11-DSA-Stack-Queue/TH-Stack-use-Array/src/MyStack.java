public class MyStack {
    private int[] arr;
    int size;
    int index = 0;
    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }
    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("unable to push element");
        } else {
            arr[index] = element;
            index++;
        }
    }
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }
    public int size() {
        return index;
    }
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }
    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }
}

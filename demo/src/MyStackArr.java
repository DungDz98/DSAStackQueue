public class MyStackArr {
    private int top;
    private int capacity;
    private int[] array;

    public MyStackArr(int capacity){
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = -1;
    }

    public boolean isFull(){
        return this.top == this.capacity - 1;
    }

    public boolean isEmpty(){
        return this.top == -1;
    }

    public void push(int value){
        if (this.isFull()) {
            return;
        }
        this.array[++this.top] = value;
        System.out.println(String.format("%d pushed.", value));
    }

    public int pop(){
        if (this.isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return this.array[this.top--];
    }

    public int peek(){
        if (this.isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return this.array[this.top];
    }
}

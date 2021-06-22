public class MyStackLink {
    class StackNode {
        int data;
        StackNode next;
    }
    private StackNode root;

    public boolean isEmpty(){
        return this.root == null;
    }

    public void push(int data){
        StackNode stackNode = new StackNode();
        stackNode.data = data;
        stackNode.next = root;

        this.root = stackNode;
        System.out.println(String.format("%d pushed.", data));
    }

    public int pop(){
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }

        StackNode tempNode = this.root;
        this.root = tempNode.next;

        return tempNode.data;
    }

    public int peek(){
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }

        return this.root.data;
    }
}

import java.util.Stack;

public class ReverseArr {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Integer[] arr = {0, 1, 2, 5, 6};
        for (Integer element : arr) {
            stack.push(element);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println("After reverse : ");
        for (Integer element : arr) {
            System.out.printf(" %d", element);
        }
    }
}

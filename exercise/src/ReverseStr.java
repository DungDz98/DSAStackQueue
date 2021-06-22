import java.util.Stack;

public class ReverseStr {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String str = "Hello";
        String[] arr = str.split("");
        for (String element : arr) {
            stack.push(element);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println("After reverse : ");
        for (String element : arr) {
            System.out.printf("%s", element);
        }
    }
}

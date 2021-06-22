import java.util.Iterator;
import java.util.Stack;

public class demo {
    public static void main(String[] args) {
        Stack<String> list = new Stack<>();
        System.out.println("Check empty 1: " + list.isEmpty());
        list.push("Còn");
        list.push("cái");
        list.push("nịt");
        System.out.println("Check empty 2: " + list.empty());
        System.out.println("1. Stack: " + list);
        list.pop();
        list.pop();
        System.out.println("2. Stack: " + list);
        list.push("gì");
        list.push("nữa đâu");
        list.push("mà");
        list.push("khóc với sầu");
        System.out.println("Phần tử cuối: " + list.peek());
        System.out.println("3. Stack: " + list);
        System.out.println("Find 1: " + list.search("khóc với sầu"));
        System.out.println("Find 2: " + list.search("nịt"));
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
        }

    }
}

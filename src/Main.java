import entities.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(2);
        stack.push(3);
        stack.push(10);
        stack.push(15);
        stack.push(25);

        for (var i : stack) {
            System.out.print(i + " ");
        }

        System.out.println();

        stack.pop();
        Integer testItem = stack.pop();

        System.out.println("Item = " + testItem);

        for (var i : stack) {
            System.out.print(i + " ");
        }

        System.out.println("\n" + "Size of stack = " + stack.size());
        System.out.println("Peek = " + stack.peek());

    }
}
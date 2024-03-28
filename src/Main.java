import entities.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.push(2);
        queue.push(3);
        queue.push(10);
        queue.push(15);
        queue.push(25);

        for (var i : queue) {
            System.out.print(i + " ");
        }

        System.out.println();

        queue.pop();
        Integer testItem = queue.pop();

        System.out.println("Item = " + testItem);

        for (var i : queue) {
            System.out.print(i + " ");
        }

        System.out.println("\n" + "Size of stack = " + queue.size());
        System.out.println("Peak = " + queue.peak());
        System.out.println("Base = " + queue.base());
    }
}
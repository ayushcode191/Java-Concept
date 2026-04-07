import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        // Single ended queue

        // Enqueue
        queue.add(1); // exception
        queue.offer(2); // false (Safer)
        queue.offer(3);

        // front access
        System.out.println(queue.peek()); // return null
        System.out.println(queue.element()); // Exception

        // Dequeue
        queue.remove(); // unsafe (through Exception)
        queue.poll(); // safer return null

    }
}

// Stack Queue => Behaviorial contract. => Developer ensure that only called method that are allow in Stack & Queue. 
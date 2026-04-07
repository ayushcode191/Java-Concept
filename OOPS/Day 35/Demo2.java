import java.util.PriorityQueue;

public class Demo2 {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(10);
        pq.offer(5);
        pq.offer(4);


        PriorityQueue<Integer> pq2 = new PriorityQueue<>((a,b) -> b-a);
        pq2.offer(10);
        pq2.offer(5);
        pq2.offer(4);
    }
}
// add,offer
// remove,poll
// element,peek
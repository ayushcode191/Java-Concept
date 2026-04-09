
public class Demo3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Ayush");
        sb.append(" Bansal");

        // // sb.insert(2,'0');

        // // System.out.println(sb);

        // // sb.delete(0,2);

        // // sb.deleteCharAt(1);

        // sb.replace(1,3,"XY");
        // System.out.println(sb);
        // sb.reverse();
        // System.out.println(sb);

        // sb.setCharAt(1, 'g');

        System.out.println(sb.capacity());
        sb.ensureCapacity(50);

        sb.trimToSize();
        
    }
}

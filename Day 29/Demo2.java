import java.util.Iterator;

public class Demo2 {
    public static void main(String[] args) {
        String[] names = {"Aditya","Ayush","vaibhav","Abhishek","Aman"};
        NameContainer container = new NameContainer(names);

        // Iterator<String> it = container.iterator();

        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }


        // Enhanced for loop => for each loop => Internally Iterator hi use karta hai
        for(String name : container){
            System.out.println(name);
        }
    }
}


class NameContainer implements Iterable<String> {
    private String[] names;
    private int size;

    NameContainer(String[] names){
        this.names = names;
        this.size = this.names.length;
    }

    @Override
    public Iterator<String> iterator(){
        // return new NameContainerIterator();

        // As a Annonymous class because no extra use of this class
        return new Iterator<String>() {
            private int pos = 0;

            @Override
            public boolean hasNext(){
                return pos < size;
            }

            @Override
            public String next(){
                return names[pos++];
            }
        };
    }

    // private class NameContainerIterator implements Iterator<String> {

    //     private int pos = 0;

    //     @Override
    //     public boolean hasNext(){
    //         return pos < size;
    //     }

    //     @Override
    //     public String next(){
    //         return names[pos++];
    //     }
    // }

}
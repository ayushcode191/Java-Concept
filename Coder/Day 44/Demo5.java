import java.io.FileNotFoundException;
import java.io.FileReader;


public class Demo5 {
    // not recomended to use throws in main method
    public static void main(String[] args) throws FileNotFoundException {
        // FileReader fr = new FileReader("abc.txt");

        // try{
        //     FileReader fr = new FileReader("abc.txt");
        // }
        // catch(FileNotFoundException e){
        //     System.out.println(e.getMessage());
        // }

        // readFile();

        // try{
        //     readFile();
        // }
        // catch(FileNotFoundException e){
        //     System.out.println(e.getMessage());
        // }

        readFile();
    }

    private static void readFile() throws FileNotFoundException{
        
        FileReader fr = new FileReader("abc.txt");
        
    }
}

// CheckedException

# Types of I/0
=> console I/O
=> File I/O
=> Network I/O
=> Memory I/O


# Console I/O
System.out.println("Hello);
=> println() => Method
=> out is static refernce variable of PrintStream Class in System Class.



# Input

System.in => InputStream  => By Default Keyboard se Input se lene ke liye bani hai.
System.out\  => OutputStream => PrintStream is child class of OutputStream 
System.err/

=> Streams => flow of Data
=> InputStream => Data flow into Program
=> OutputStream => Data flow out of Program
=> Both are Java Abstract Classes

=> Java I/O => Stream Based => Console, file, Network, Memory.
=> All of them are Stream of Bytes
=> 1 Byte = 8 bits


# InputStream (Abstract class)  --> read();
1. FileInputStream   
2. BytearrayInputStream
3. BufferedInputStream
4. DataInputStream


# OutputStream (Anstract Class)  --> write()
1. FileOutputStream
2. ByteArrayOutputStream
3. BufferedOutputStream
4. PrintStream 


=> InputStream --> read() --> stream of bytes


# Reader (Abstract class) => Read Stream of Characters Directly.
1. BufferedReader
2. InputStreamReader
3. FileReader

=> BufferedReader 
1. Read chunks of character from OS Buffer.
2. Store it into memory.
3. Give them to Program when required.

=> InputStreamReader => Converts Stream of Bytes to Stream of Characters.


# Scanner
=> java.util 
=> Utility class
=> is wrapper of InputStream class

=> Readable Interface


Scanner sc = new Scanner(System.in) => for Keyboard 

Scanner sc = new Scanner(new File("Sample.txt"));
=> For file Input

Scanner sc = new Scanner("10,20,30") => String Input.


// Tokenization
// delimeter => white spaces

sc.next() => only one word
sc.nextLine() => whole line
sc.nextInt() => take Integer value
sc.nextDouble() 

=> Scanner class is slow then BufferedReader
=> because it use tokenization regex, type Conversion etc.
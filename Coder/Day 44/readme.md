# Nested try-catch block

Case1:- 
try {
    try{

    }
    catch(){

    }
}
catch(){

}

case2:-

try{
    try{

    }
}
catch(){

}
// parent catch() kaam karega if inner try me exception aya to


1. try{

}
catch(){
    ///   

    try{

    }
    catch(){

    }
}

// same tarike se kaam karega

=> Practical case me avoiud nested try-catch blocks.


# Hierarchy of Exception Handling

=> Throwable class has three methods.
1. getMessage()
2. printStackTrace()
3. toString()


           Throwable(C)
           /        \
          /          \
         /            \
    Error (C)         Exception (C)
                    /              \
                   /                 \
                  /                    \
(UncheckedException)RunTimeException(C)  CheckedException(not a class)
    1. NullPointerException               1. IOException
    2. ArithmeticException                 i. FileNotFoundException
    3. IndexOutOfBoundException            ii. EndOfFileException
      i. ArrayIndexOutOfBoundException    2. SQLException
      ii. StringIndexOutOfBoundException  3. ClassNotFoundException
    4. IllegalArgumentException
     i. NumberFormatException
    5. IllegalStateException
    6. ClassCastException


# Throw own Exception 

1. Throw keyword
2. throws


# Custom Exception
=> Name of Exception according to business logic.
1. InSufficientBalanceException
2. InvalidAgeException

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message){
        super(message);
    }
}
// we can throw 


# try-with-resource
=> Esa Object jise close karna ho resource hota hai.
1. File
2. DB connection
3. N/W socket

try{
    // risky code
}
catch(){
    // handled code
}
finally{
    // Resource closed code
}


// don;t need for closing the resource automatically closed resource whether Exception occured or not.
try(FileReader fr = new FileReader("abc.txt")){

}
catch(){

}
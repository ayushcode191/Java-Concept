# Exception Handling

=> Problem occurs categorised in two categories.
1. Error
2. Exception:- A recoverable/ handleable abnormal condition that occurs during program execution.

Exception ka object create karta hai.
Ex:- Divide by zero
int num = a/b;
3/0 -> Airthmetic Exception.

=> File is missing.


=> Error:- Serious problem which can not be recover
1. Out of memory Error :- Heap Memory bhar gayi 
2. Stack Over flow Error:- Stack memory bhar gayi.

=> Error ka bhi object return karta hai.


=> How to handle the Exception?
=> 1. If else se kar le :- preventive Measure (Graceful handling)
=> Exception handling :- If not then JVM handle everything.
=> If handle Exception then flow control aap karte hai and user experience better hota hai.




int a = 5;
int b = 0;

System.out.println(a/b);

jaise hi a/b par aayega 
JVM:- Flow of control ruk jayega new Airthmetic Exception(msg) :- predefined message :- "/ by zero".
It is default Exception handling if top of the stack tak kisi ne Exception handle nahi kiya.

Stack me 
main() --> method A() --> method B() 

If method B khatam the stack se pop and apne caller ke pas then ye uske caller ke pas jab tak empty na ho jaye stack 

jab Exception aati hai to JVM Excption ka object create karta and throw karne ki koshish karta and dekhega top of the stack tak check karega ki kisi ne Exception handle kiya If not then console par pura Stack Trace print karta hai 

=> Stack Trace is a report kaise flow hai Exception ka => debugging easy ho jati hai.


=> How can we handle we want 
" When an Exception occurs, don't crash, handle it and continue flow of program.

=> try-catch block 

try{
    // risky code
}
catch(Exception e){
    // handling code if exception occurs in try block.
}
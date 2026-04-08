# Inner Class
1. static Nested
2. Inner class
3. Local class
4. Anonymous class

=> Why we nested ?
1. Logical Grouping => class meaningfull when it is inner the outer class. Bahar hona koi logically sound nahi.
2. Better access to outer class. => Can access private member of outer class.


# Static Nested Class

class outer {
    static class inner {

    }
}


# Inner class

class outer {
    class inner {

    }
}

=> Heap memory me dono ke alag alag object banege and stack memory me refernce store hoga dono ka and inner class ke pas authomatically outer class ka reference hoga (this).

=> Inner class can access static and non static memeber of outer class whether public or private 

class outer {
    int x = 10;
    class inner {
        int x = 20;

        
    }
}

normal inner class can't have static memmber => up to java 16 and why ? and now allowed why?

=> 
class outer {
    class inner {
        static int x = 20;
    }
}

// x har ek outer ke object ke liye same or alag alag => confusion create ? solve by nested static class.
=> But now this problem solve in new Java.


# Local class 
=> very less use
// kisi code block ke andar

{
    class local {

    }
}


# Anonymous class
=> A class without name

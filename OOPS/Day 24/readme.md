# Interface
=> Interface define method what an object can do without telling how it does that.
=> Blueprint of behavior
=> It is a contract.



# Diamond Problem

     class A 
    /       \
class B       class C
     \        /
       class D


     interface A 
    /       \
interface B   interface C
     \        /
       class D


# After Java 8 
=> interface me 
default method, static method, private method(After Java9), static final variable.
=> to abstract class se different kaise 

Gap =>
Interface               Abstract class
=> contracts             => families of similar class
=> Roles                 => 
=> functionality
Ex:- Runnable, Walkable
=> can do relationship    => Is-A Relationship
=> fields : By default    => not by default
static and final 
=> No constructor allowed  => Constructor allowed
in interface
=> Multiple Inheritence     => not allowed
allowed
=> public , private allowed => any access modifiers



# Functional Interface
=> only one abstract method
=> Unlock functional Programming => Lambda Expression
EX:- Comparable, Predicate

# Marker Interface
=> No method

interface A {

}
=> Cloneable
=> Serializable
=> RandomAccess

=> why they exist?
=> used for marking

Object class ke andar clone method hai if any class ko ise override karna hai to us class ko implents karna padega Cloneable interface ko to inform jaav that class is overriding the clone method.



=> After compiling interface ko java class => .class file hi banata hai.
ek tage ACC_Interface => tells java that it is interface.

class MethodOverriding							// PARENT/SUPER  METHODS AND CHILD/SUB METHODS 
{
static Object login()				//1. Different class or multipule class 
{
System.out.println("Cool...!");				//2. same method name 
return ' ';
}
static Object login1()				//3. same arguments , no. of args and sequences by check formal args and actchual args.		
{
System.out.println("Better ....");			// return types are data types and void.
return null;
}
static Object login2()
{							// it os possible java 5.0 on words ,
System.out.println("morvaless ....");			// it is know as "Covariant return type", Object is the parent return type and all other data types child/sub return types.
return null;
}
static Object login3()
{
System.out.println("mind blowing ....");		//static key word compalsarily use both in super and sub methods other wise it gets compile time error
return null;						// if default means default compalsarily .
}
static Object login4()
{
System.out.println("excaitment ....");
return 0;
}
}



							// we can also tack different return types
class SubClass extends MethodOverriding		
{		
static Character login()				// we can create any no. of main methods in a class
{							// we can't override main() mrethod, because static method can't overridden. 
System.out.println("Average ....");
return ' ';
}
  static String login3()				// empty args is also valid to access the program.	
{
System.out.println("Nonsence....");
return null;
}
static StringBuffer login1()
{
System.out.println("un-beliavable....");	
return null;
}
 static StringBuilder login2()
{
System.out.println("Obnormal....");
return null;
}
static Number login4()
{
System.out.println("suspesias....");
return 0;
}

public static void main(String[] args) 			 // it is a calling method and above all are called methods.
{
SubClass s = new SubClass();
s.login();     						//calling of a method process is know as bainding and also a runtime/dynamic bainding.

s.login1();  

s.login2();					

s.login3();

s.login4();

MethodOverriding sk = new MethodOverriding();		//campalsarily we can create both objects so we can get output
sk.login();						// otherwise by direct calling  we can get only sub calss output repitedly 

sk.login1();

sk.login2();

sk.login3();

sk.login4();
		
}
}



// it is also look lick Inheritance 
/* we can write no. of methods by different method-names/identifiers in super class but same identifiers must and should be writen in sub class .

Object: it is a member of a java class ,it has a idenntity ,behavior and state. it stors fealds,methods,functionsand display the object behavior.

Use of an object they can be created to call a non-static functions which are not present in side main method but present in Class.

The Object is the instance itself, where as the object Veriable is the reference to the Object .
we can create no. of Object in the class, it is a Non-primitive variable and Object refarence veriable .

StringBuffer is a peer class of String that provides much of the functionality of Strings.
it is used for to create modifiable String Objects. This means that we can use StringBuffer to append, reverse, replace, concatenate and manipulate Strings or sequence of characters.

the String class to create and manipulate strings. Whereas, StringBuffer class is a thread-safe, mutable sequence of characters. A string buffer is like a String,
 but can be modified. ... Every string buffer has a capacity.
 
 String is an immutable class and its object can't be modified after it is created but definitely reference other objects. String buffer is mutable classes 
 which can be used to do operation on string object such as reverse of string, concating string and etc. ..
 
 StringBuffer is thread-safe meaning that they have synchronized methods to control access so that only one thread can access StringBuffer object's synchronized code at a time
 
 in heap stringbuffer stored .
 StringBuffer is thread-safe and StringBuilder is not thread-safe
it capacity is 16 charecters 

StringBilder:

it is a class used to create a mutable.

A String is immutable in Java, while a StringBuilder is mutable in Java.
 An immutable object is an object whose content cannot be changed after it is created.






class MORRDcase3								// EXCEPTION - HANDLING		
{												//SECOUND RULE 
public static void shaguftha()throws ArithmeticException		// if super clase method we can give RuntimeException then sub class method we can give  
{									// empty , same of RuntimeException and ArithmeticException.
System.out.println("Talented..");					// 
}
public static void shaguftha1()throws ArithmeticException
{
System.out.println("Cool...");						//BOTH EMPTY ALSO POSSIBLE AND GET'S COMPILE
}
}

class Friends extends MORRDcase3								// FIRST RULE  
{
public static void shaguftha()throws ArithmeticException        // ArithmeticException is un-cheked Exception it used in sub class method so it will get compile 
{								// where threr is empty/same ArithmeticException AND RuntimeException of in super class method,other wise it gets compile time error.
System.out.println("Good..!");					// we can ues Exception in the place of ArithmeticException also gets an error because its a parent class.
}
public static void shaguftha1()throws RuntimeException		// Exception is a cheked Exception .
{
System.out.println("Nathural...");
}
public static void main(String[] args)
{
Friends f = new Friends();
f.shaguftha();
f.shaguftha1();
MORRDcase3 m = new MORRDcase3();
m.shaguftha();
m.shaguftha1();
}
}

/*
Defination:
 it is one of the powerful mechanism to handle the runtime errors so that the normal flow of 
 the application can be maintained.(or) another defination is,
 Exception handling ensures that the flow of the program doesn't break when an exception occurs.
 
 by this it handling is managed via 5 key words 
 1.try
 2.catch
 3.throw
 4.throws
 5.finally
 
 it is divided in to 3 types 
 1. checked exception		
 2.Uncheckedexception
 a.Errors
 b.Runtime Exception
 
 1:
 Checked exceptions are exceptions that a Java application should be able to cope with.
 Checked exceptions are also known as compile time exceptions as these exceptions are checked by the compiler during the compilation process to conform wether the exception is handled by the programer or not.
if not,then the system displays a compilation error.

 2:
 the uncheked exceptions are those exception that occur during the exception of the program.Hence they are also referred to as Runtime Exception. These exceptionns are genarally 
 ignored during the compiletion process. they are not cheked while compilation the program.
 
 a:
 When an exception occurs the JVM will create an exception object. These objects all derive from the Throwable class.
  The Throwable class has two main subclasses— Error and Exception. The Error class denotes 
  an exception that an application is not likely to be able to deal with. 
 
 b:
 A runtime exception occurs simply because the programmer has made a mistake. You've written the code, 
 it all looks good to the compiler and when you go to run the code, it falls over because it tried to access
  an element of an array that does not exist or a logic error caused a method to be called with a null value.
 
 
 why  handle meance The exceptions should be handled to prevent any abnormal termination of a program.
 if not meance  the program terminates abruptly and the code past the line that caused the exception will not get executed.
 
 
 
 *
 *
 *
 */
 

class MethodOverriding
{
public static void login(int a,String b)	//1. Different class or multipule class 
{
System.out.println("Cool...!");			//2. same method name 
}
public static void login1(int a,String b)	//3. same arguments , no. of args and sequences by check formal args and actchual args.		
{
System.out.println("Better ....");		// return types are data types and void Object is the parent of all other of datatypes.
}
}
						// we can also tack different return types
class SubClass extends MethodOverriding		
{
public static void login(int a,String b)	
{						// we can't override main() mrethod, because static method can't overridden. 
System.out.println("Average ....");
}
public static void login1(int a,String b)	// empty args is also valid to access the program.	
{
System.out.println("Nonsence....");
}

public static void main(String[] args)  // it is a calling method and above all are called methods.
{
SubClass s =new SubClass();
s.login(321,"123df");     		//calling of a method process is know as bainding and also a runtime/dynamic bainding.

s.login1(123,"sksdfs4322");  

MethodOverriding sk = new MethodOverriding();	//campalsarily we can create both objects so we can get output
sk.login(321,"321sdgs");			// otherwise by direct calling  we can get only sub calss output repitedly 

sk.login1(123,"sks12312");
		
}
}

// it is also look lick Inheritance 

// we can write no. of methods by different method-names/identifiers in super class but same method-names/identifiers must and should be writen in sub class .

/*defination:
 * 		If subclass has the same method and same parameters as declared in the base class, it is known as method overriding 
 *
 *		Method overloading is a form of polymorphism in OOP
	
	Difference of overloding and overriding
		method overloading, methods must have the same name and different signatures.
		 In method overriding, methods must have the same name and same signature
	 
	 Polymorphism is the process to define more than one body for functions/methods with same name

Static methods cannot be overridden because they are not dispatched on the object instance at runtime.

	variable is not overridden, they do not override one another
 *
 *Abstract methods and private methods cannot be overridden .
 *
 *Method hiding may happen in any hierarchy structure in java. When a child class defines 
 *a static method with the same signature as a static method in the parent class, then the
 * child's method hides the one in the parent class is known as method hiding.
 *
 * Constructor Overriding is never possible in Java. 
 *This is because, Constructor looks like a method but name should be as class name and no return value
 *so it is not posible.
 *
 *
 *
 *
 *
 */






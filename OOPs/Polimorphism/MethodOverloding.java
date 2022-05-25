class MethodOverloding	//Ex: FaceBook login		
{
public static void login(int a,String b)	//1. same class or with in the class 
{
System.out.println("cool...!");			//2. same method name 
}
public static void login(String a,String b)	//3. different arguments , no. of args and sequences by check formal args and actchual args
{
System.out.println("average....");
}
public static void login(int a,int b)		// WE CAN ALSO CHANGE RETURN TYPE 
{
System.out.println("better ....");		// return types are data types and void.
}
public static void login(String a,int b)
{						// we can also overlode main() mrethod. 
System.out.println("noncence ....");
}

public static void main(String[] args)  // it is a calling method and above all are called methods.
{
login("sks",123);     		//calling of a method process is know as bainding and also a compile/static bainding.

login(123,"sks");  

login(123,321);

login("gmk","sks");
		
}
}

Formula :
	 
/*	which a class has more than one method of the same name
	and their parameters are different is known as Method Overloading.
	
	Types is
	1.By changing the number of parameters. (int a) & (int a, int b)
	2.By changing the Data types of the parameters (int a,int b) & (Double a,double b,double c)
	3. By changing the Order of the parameters (int a,String b) & (String a,int b)
	
	Method overloading is a form of polymorphism in OOP
	
	Difference of overloding and overriding
		method overloading, methods must have the same name and different signatures.
		 In method overriding, methods must have the same name and same signature
	 
	 Polymorphism is the process to define more than one body for functions/methods with same name

Static methods cannot be overridden because they are not dispatched on the object instance at runtime.

	
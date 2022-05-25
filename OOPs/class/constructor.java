 class constructor{ //similar of class and method name. 

private constructor() //it dos not have any return type , modifier applicable for constructor as public,protected,private,default. 
{
System.out.println("true");
}
public static void main(String[] arg){	// static is not allowed only allow public,protected,private,default.

constructor s = new constructor(); // it will exicutes when we creation of an object .
}				// it is a non-access modifier so we creating an object.
}

/* formula: Constrocter is nothing but a method similar to the method_name and class_name ,it dos not have any return type and
		 modifier applicable for constructor as public,protected,private,default it will directly exicuted by the creation of an Object.
use :  it is used to initializing the newly created object of a class and allocate appropriate memory to objects.
 	with out constructer we can't create instances and based on files of a class

interface can't have any constactor
*/


/* we have 2 types of constuctor in java 
 1. parameterized constructers
 2. no-arg constactors / non-parameterized constructor

class Test{
int no;
String name;
private Test(int no,String name)
{
this.no = no; 		// after this also we can write sopln
this.name = name; // after this also we can write sopln
}
public static void main(String [] args)
{
Test t = new Test(01,"Santhosh"); by the creation of an object directly called it.
System.out.println(t.no);

System.out.println(t.name);
}
}

class Test{
int no;
String name;
private Test()
{
this.no = 11;				// after this also we can write sopln
this.name = "Santhosh gmk";// after this also we can write sopln
}
public static void main(String [] args)
{
Test t = new Test();		by the creation of an object directly called it.
System.out.println(t.no);
System.out.println(t.name);
}
}
*/

/*A constructor is called automatically when we create an object of class. ... 
A constructor is a special type of function with no return type. 
Name of constructor should be same as the name of the class. 
We define a method inside the class and constructor is also defined inside a class.
*/

// copy constractor is a constractor creates an object using another object of the same java class.
// constactor can't be a sychronized and false constactor is can't have a return type it gets comple time error.

//A class or struct can only have one static constructor.
//Static constructors cannot be inherited or overloaded.

//both this() and super() can not be used together in constructor. this() is used to call default constructor 
//of same class.it should be first statement inside constructor. super() is used to call default constructor of base class.
//it should be first statement inside constructor.
									// STATIC VERIABLE
/*class StaticKeyword
{
static int a = 23;		// if it is used in out of the class, it gets an error .
}

class dhana
{
public static void main(String[] args)
{ 
System.out.println(StaticKeyword.a);	// in this am calling directly with out using 
}				// extends/inherit the class by giving "class_name.static_veriable_name".
}
*/

		// it is mainly using redusing the memory of a programe .
//eg:
 /*
class Employee
{
int empid;
String name;
static String company = "QJspiders";    // remove this instiolization add

 public  Employee(int empid,String name) // here you add String 
{
this.empid=empid;
this.name=name;			// add another String here
}
void display()
{
System.out.println(empid+" "+name+" "+company);
}
public static void main(String[] args)
{
Employee e = new Employee(101,"Santhosh Kumar.GMK" ); //add here also name of copany
e.display();
Employee e1 = new Employee(102,"Shaguftha" );		// it leads to get lot of memory so it is redused by static keyword all this nonsence.
e1.display();
Employee e2 = new Employee(103,"Priyanka" );
e2.display();
Employee e3 = new Employee(104,"Amardeep" );
e3.display();
Employee e4 = new Employee(105,"gautam" );
e4.display();
}
}*/

/*							//STATIC METHOD
class Friends 
{
static void valid()			// it works with in the class only not other class ,it is a manegement of memory by static.
{
System.out.println("Valid Operation");	// it can access only static data can't access non-static data,
}					// it can call only other static methods can't call non-static methods,
public static void main(String[] args)	// it can't refer to "this" or "super" keyword in anyway.
{
valid();  // or we can call " Friends.vaiid(); " both or compiled.
}
} */
							// STATIC BLOCK
/*
class Friends 				// it exicutes autometically ,when the class is loded in the memory .
{
static 			
{
System.out.println("work out");
//System.exit(0);------------------------------>by this statement we can exicutes only static block not main method .
}
static int a;				// we can also declirein globel  and instiolization in static block.
static 
{
a=10;
System.out.println("Valid work out");
System.out.println(a);
}

public static void main(String[] args)
{
System.out.println("Valid Operation");
}
}
*/
							// STATIC CLASS

class Group
{
	static class GCGE4				// it is also known as Nested class or inner class .
	{
	static int i = 10;
	public static void Shaguftha()
	{
	System.out.println("coollll....!");
        
	}
	}
public static void main(String[] args)
{
Group.GCGE4 g = new Group.GCGE4();		// to call static class methods we use 
g.Shaguftha();	
System.out.println(g.i);				//"outer class_name.inner class_name veriable = new  outer class_name.inner class_name".
}
}


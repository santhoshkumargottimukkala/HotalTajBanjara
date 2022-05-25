interface  Hari			 // it is similar to abstract class 
{
 void show();			 //it is similar to abstract method and "public abstract" in method may tack are not if no means compiler auto taken.
				// in these method we can tack variable dicleration and intionalization.
 public int a = 12; 		 // we can't use only decleration 
   }				// these variables we can use public,static and final
interface  Dhana
{
final int s = 12345;		//abstract keyword is not-mandetary in method
public abstract void display(); 
//we can also tack plenty of methods called functions
static int aa = 123;		

}
class Santhosh implements Hari,Dhana
{

public void show() 		 // same by abstract methodof static topic use or not. 
	{
	System.out.println(aa);
	System.out.println("Frinds");
	}
public void display()
	{
	System.out.println(a);
	System.out.println("Enemies");
	System.out.println(s);
	}
public static void main(String[] args)
{
Santhosh s = new Santhosh();
s.show();
s.display();
System.out.println("Completed.......................!!!!!");
}
}

//it contains only abstract method 
// it is look lick Multiple Inheritence 
//two parent/super classes inherited into one child/sub class.
/*

An interface in Java is a blueprint of a class. It has static constants and abstract methods.
 The interface in Java is a mechanism to achieve abstraction.
  There can be only abstract methods in the Java interface, not method body.

an interface is a reference type similar to a class that can contain only constants,
 the method signatures, default methods, and static methods, and ts Nested types.

an interface is a device or a system that unrelated entities use to interact.

types of interface  :
1. Command Line Interface;(CLI)
			 Allows users to manage files in BlackPearl using a simple command-line interface.
			difficult to use
			it consumes low memory
			 Faster then GUI
			 it can't modified or changed
			 input only cmmand prompt.
			 
			 
2. Menu-driven Interface
			A program that displays a menu and then takes input from the user to choose an option from the displayed menu.

3. Graphical User Interface(GUI)
			  Computer program that enables a person to communicate with a computer through the use of symbols, visual metaphors, and pointing devices
				eg: Microsoft operating systems
				it concumes more memory
				Slower then CUI
				it can modified or changed
				input anywhere in the Screen
				
				
			it is easy to use
Graphical user interfaces would become the standard of user-centered design in software application programming,

4. Touchscreen Graphical User Interface
				A touchscreen GUI is a graphical user interface operated by fingertips or a stylus




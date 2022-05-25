abstract class MORRDcase4i					// ABSTRACT  IN OVERRIDING 
{							
abstract void priya();					
abstract void priya1();
abstract void priya2();
abstract void priya3();					
}							
class Friends extends MORRDcase4i
{	
public void priya()
{
System.out.println("Devils");
}							
public void priya1()					
{									
System.out.println("Devils");				
}							
public void priya2()				
{							
System.out.println("Devils");				
}							
public void priya3()					
{						
System.out.println("Devils");				
}							
}						
							
class Friends1 extends MORRDcase4i		
{							
public void priya()				// we can't use ststic keyword	
{						// why because in abstract	
System.out.println("Devil 1");			 //we cant't use static.
}							
public void priya1()					
{							
System.out.println("Devil 2");				
}							
public void priya2()				
{							
System.out.println("Devil 3");
}
public void priya3()
{
System.out.println("Devil 4");
}
public static void main(String[] args)
{
//we abstracting all super class to sub class 
Friends m = new Friends();
m.priya();
m.priya1();
m.priya2();
m.priya3();

Friends1 f = new Friends1();
f.priya();
f.priya1();
f.priya2();
f.priya3();
}
}
/*
Defination:
			it is a process of exposing all the necessary detail and hiding the rest. (or)
			 it displays only the relavent attributes of objects and hides the unnecessary details.
			 
 Use of it main purpose is Hiding the unnecessary details from the users and showing only essentional information to the user.
 
 
 
 
 
 
 



















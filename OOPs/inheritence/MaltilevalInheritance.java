class MaltiLevalInheritance	//Ex: person		
{
public static void thinking()
{
System.out.println("cool...!");
}
public static void eating()
{
System.out.println("Large amount of food");
}
}
class Group extends MaltiLevalInheritance
{
public static void walking()
{
System.out.println("Slowlyyyy...");
}
public static void acting()
{
System.out.println("Oscar level......!!!");
}
}
class Friends extends Group
{
public static void drinking()
{
System.out.println(".....!!!");
}
public static void sleeping()
{
System.out.println("dreemsssssss......!!!!!!	");
}
public static void main(String[] args)
{
	Frends s = new Friends();
		// we can also create of three ojects and call it by method_names.
s.thinking();
s.eating();
s.drinking();
s.sleeping();
	//we can create this object compalsarily other wise can't call this two methods.
s.acting();
s.walking();
/* 
 *  formula:when a class inherits from a derived class is a base class for a new class (or)
 *   when a class extends to another class that is already extended from another class, 
 * 				is known as Multilevel Inheritance,it also implemented using interfaces
 * 		
 * different of multiple inheritance is when a class inherits from many base classes
 * multilevel inheritance is when a class inherits from a derived class is a base class for a new class.  
 * 
 *  extends keyword is used to indicate that a new class
 *   is derived from the base class using inheritance
 * 
 * when we create super class of an object, only that class methods only called by main 
 method, we create sub class of an object it can call all methosd of both classes,
Child/Sub class calls them self's and Parent/Super/Base class.*/
}
}


class SingleInheritence	//Ex: person		
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
class Friends extends SingleInheritence	
{
public static void drinking()
{
System.out.println("chillllllll.....!!!");
}
public static void sleeping()
{
System.out.println("dreemsssssss......!!!!!!	");
}
public static void main(String[] args)
{
	Friends s = new Friends();
		// we can also create an oject and call it .
s.thinking();
s.eating();
s.drinking();
s.sleeping();
/*
 * formula: when the Properties and behavior derived
 * 			 from a single base/super class to single sub class is known as Single Inheritance
 * 
 *  
 *  The difference between the Superclass and Subclass, Superclass is the existing class
 *   from which new classes are derived, while Subclass is the new class that inherits the properties
 *    and methods of the Superclass.
 *  
 *  "Class" is used as a template for declaring and creating the objects.
 *  An "Object" is an instance of a class.
 *  
 *  when we create super class of an object, only that class methods only called by main 
 method, we create sub class of an object it can call all methosd of both classes,
Child/Sub class calls them self's and Parent/Super class.*/
}
}


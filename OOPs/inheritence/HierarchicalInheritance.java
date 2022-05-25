class HierarchicalInheritance	//Ex: person		
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
class Group extends HierarchicalInheritance
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
class Friends extends HierarchicalInheritance
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

	// we can also create of three ojects and call it by method_names.
s.thinking();
s.eating();
s.drinking();
s.sleeping();

Group g = new Group();		// above 2 classes transfer to last class so we can call the main class 
g.acting();
g.walking();
g.thinking();
g.eating();
/*
 * formula: the single class is inherited by multiple child classes is known as Hierarchical inheritance.
 * 
 *  one main use is the instance variables and methods from a superclass are inherited and can be
 *    used in a subclasses without rewriting or copying code.
 *  
 *  The definition of hierarchy is a group of people or things arranged in order of rank
 *  
 *  difference of hierarchical inheritance one base class and many derived classes.
 *   multilevel inheritance is when a class inherits from a derived class is a base class for a new class
 *  
 *  when we create super class of an object, only that class methods only called by main 
 method, we create sub class of an object it can call all methosd of both classes,
Child/Sub class calls them self's and Parent/Super class.*/
}
}


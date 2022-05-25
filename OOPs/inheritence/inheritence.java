class Inheritence	//Ex: person		// it is a super/parent class.
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
class Friends extends Inheritence	//it is a sub/child class.
{
public static void main(String[] args)
{
Friends f = new Friends();
f.thinking();
f.eating();
}
}

/* It atteches mainly EXTENDS key word ,
it IS - A relationship and 
REUSABILITY OF CODE.

The properties and functions of super class transfer to sub class is know as Inheritence.

*
*
* 	Multiple inheritance:
* 			
* 			When one class extends more than one classes/interface,
*			a subclass can inherit from two or more superclasses is known as multiple inheritance.
*
*different of single is one base/super class and ane sub class but multiple is one sub class and two or more base classess.
* multilevel is when a class inherits from a derived class it is becomes a base class for a new class
*
* 	it doesn't support in java
*
*	hybrid inheritance:
*
*			it is a combination of hierarchical ,multiple and single inheritance ,
*			the combination of two are more types of a inheritance is known as hybrid inheritance.  	
*		Since Java does not support multiple inheritance, hybrid inheritance
*		
*
* why not supported means if a class can implement any number of interfaces/classes but can extend only one class.
* Multiple and hybrid inheritance is not supported because it leads to deadly diamond problem.
*
*/
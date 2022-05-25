abstract class Animal{			//in abstract class cannot be create objects,to access it must be inherited.  
					// abstract key word is non-access modifier use only classess and methods.
public abstract  void sound(); 		// in abstract method does not have any body and it provided in sub classes only
}
					//abstract method is used in abstract class only.
class Lion extends Animal{
public void sound()			//abstract keyword is mandetary/compalsarily in method
{
System.out.println("Lion sound is 'Rour'");
}
}			    		 //	if static is usedin sub methods, it is syntax error why becouse we creating an objest in main mthod
class Tiger extends Animal{		//if it is used remove objects and directly call the methods but both the methosd are same so it well not possible .
public void sound()
{
 System.out.println("Tiger sound is 'gaarrr'");
}
}
class Main{
public static void main(String[] arg){
Lion l = new Lion();
l.sound();
Tiger t = new Tiger();
t.sound();

}
}

//it contains abstract and non-abstract method
//it does not possible of multiple inheritence
/*no need to declare public,static and final in veriables.

Defination :
	abstraction “displays” only the relevant attributes of objects and “hides” the unnecessary details
or An Abstraction is a process of exposing all the necessary details and hiding the rest.
or Hiding the implementation and showing only the features.
or It includes hiding the implementation part and showing only the required data and features to the user

use of an abstraction is hiding the unnecessary details from the users.eg: ATM's

 Abstraction is related to both encapsulation and data hiding.

 A method which is declared as abstract and does not have implementation is known as an abstract method.
 Abstract methods are virtual by definition

abstract class a type of class that object can not be create it contain abstract or not
 abstract method while abstraction is mechanism of data hiding

abstraction is achieved by using the abstract keyword for classes and interfaces

Abstraction is Hiding and abstract is a keyword and Classes/Methods are created
 so thet can be implimented in its subclass because the abstract class does'n't know what 
 to implimentin the method but it knows that the abstract will exit in its subclass.

An abstract class allows you to create functionality that subclasses canimpliment or override.
an interface only allows you to define functionality,not impliment it  And whereas a class can extend only one abstract class,
 it can take advantage of multiple interfaces

An abstract class can contain static variables and methods.
 An interface contains only public static final variables.

Abstraction is the method of hiding the unwanted information. Whereas encapsulation is a method to hide the data in a single entity
 or unit along with a method to protect information from outside.

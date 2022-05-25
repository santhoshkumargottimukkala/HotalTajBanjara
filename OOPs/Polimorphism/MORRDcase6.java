class MORRDcase6							// FINAL , STATIC AND PRIVATE WE CAN'T BE OVERRIDDEN
{
 	  void amardeep()					//FINAL
{
System.out.println("Multi Talented");			//we can't overridden "final" keyword but we can use in sub class method it should be final we con't change it.
}							// if we don't want to be overridden only mention/declare final
	static void amardeep1()				 	//STATIC
{
System.out.println("Morvaless");			//it should be compalsarily in both super and sub class methods.
}							//we define a static method in sub with same signature as a static in base or super class method is known as "METHOD HIDING".
	 void amardeep2()					//PRIVATE
{
System.out.println("Mind blowing");			// it can't ovrridden "private" as they are in bounded in compile time so con't overridden in super/sub calss.
}
	 void amardeep3()					// DEFAULT
{
System.out.println("Mind block");			// if default is in class method we can write default/final in sub class method it get compile.
}
}									//FINAL

class Friends extends MORRDcase6			//if we create a final veriable we can't change the value of final veriable to another/same veriable.
{							//if we create a final method we can't override the method implimentation/context/block of final method to another method.
	 final void amardeep()				//if we create a final class we can't inherit the methods of final class to another class.
{
System.out.println("Multi Talented 1");
}									
	
	static void amardeep1()				
{
System.out.println("Morvaless 1");
}
	 void amardeep2()
{
System.out.println("Mind blowing 1");
}
	 void amardeep3()
{
System.out.println("Mind block 1");
}
public static void main(String[] args)
{
Friends f = new Friends();					// we can create both objects compalsarily if either ststic use or not it's secoundary.
f.amardeep();
f.amardeep1();
f.amardeep2();
f.amardeep3();					

MORRDcase6 m = new MORRDcase6();
m.amardeep();
m.amardeep1();
m.amardeep2();
m.amardeep3();
}
}
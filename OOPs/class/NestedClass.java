import com.jspider.javafiles.Hello;

class MainClass{	//Outer class
 
	static class NestedClass{	//Inner Class 

	   public void nm1() // innerclass methods transfer outerclass methods 
		{			//then exicute in main method by create of an object. 
		int a = 36;
		System.out.println(a);
			nm2();
		}
	     public void nm2()
		{
		int a = 63;
		System.out.println(a);
		}
	}
/*void outer()		// use these also we can run the program but it is posible by removing static key word in inner class of nested class 
{
NestedClass s1 = new NestedClass(); // there is no object no compile 
s1.nm1();				
}*/
public static void main(String[] arg)
{ 

MainClass.NestedClass s = new MainClass.NestedClass();	//by these process we can also run, there is no object no compile .
s.nm1();
}
}

/* formula: with in the class creation of an another class static or non-static/instance is known as Nested class 
   
  it is used in one place of enable to logically group of class. 
   A nested class is a member of its enclosing class. 
  Nested class are divided in to 2 types 
  1.Static nested class :
  		
  		 Nested classes that are declared static are called static nested classes. 
 		we nest class  whenever you want to create more than once instance of the class 
 		eg: (above)
  2.inner class :
  			An inner class is also a non-static nested class.
  		we can't declare main method why because it is a static method it allows only non-ststaic methods.(non-static class not allow main static method).
  		use of inner class is a set of multipule operations are required in it.
  		advantage is it shows a special type of relationship
  		we can create 300 million inner classess in a class
  		eg: (above)
  
  in these we have A. Local inner class     // non-static 
  					B. Anonymous inner class   // non static
  					C. Method local inner class  //non static
  			A. eg:
  Syntax:OuterClass.InnerClass innerObject = outerObject.new InnerClass();
  			
  				class sample
    	{
	
		    static int outer_x = 10;
		    int outer_y = 20; 
		    private int outer_private = 30;
		    
		    class InnerClass
		    {
		        void display()
		        {
		            System.out.println("outer_x = " + outer_x);
		            System.out.println("outer_y = " + outer_y);
		            System.out.println("outer_private = " + outer_private);
		        }
		    // we can aslo create another method call to the method and send to main method in another class
		    }
		}
		
		 class InnerClassDemo
		{
		    public static void main(String[] args)
		   {
		        sample o = new sample();
		      sample.InnerClass a = o.new InnerClass(); 
		        a.display(); 
		        
		         (sample.innerClass a = new sample.innerClass();)
		    	IT IS NOT POSIBLE, WHY BECOUSE IT IS A NON-STATIC CLASS .
		    }
		}
		
		B.
		Anonymous inner classes are declared without any name at all.
		  They are created in two ways. 
				1. As a subclass of the specified type
				2. As an implementer of the specified interface
		  1.eg:
		  first you have to create an object and implimantation of it.

class Demo 
{
	void show()
	{
		System.out.println(
			"i am in show method of super class");
	}
}

class Demo1
 {

	static Demo d = new Demo() 
    {
		void show()
		{
			super.show();

			System.out.println("i am in Flavor1Demo class");
		}
	};

	public static void main(String[] args)
	{
		d.show();
	}
}

Here demo act as a super-class and the anonymous/Demo1 class acts as a subclass,
 both classes have a method show(). 
In anonymous class show() method is overridden.


		2.eg:
		first you have to create an object and implimantation of it.

interface Hello
{
    void show();
} 
class Sample 
{
    static Hello h = new Hello()
    {
   
        public void show()
        {
            System.out.println("i am in anonymous class");
        }
    };
 
    public static void main(String[] args)
    {
        h.show();
    }
}

In the above code, we create an object of anonymous inner class but this anonymous
 inner class is an implementer of the interface Hello. Any anonymous inner class can 
 implement only one interface at one time. It can either extend a class or implement an interface at a time.			
	
	advantage it not wast lots of your memory	
		  
		
 		A regular class can extend a class and implement any number of interfaces simultaneously. But anonymous Inner class can extend 
 	a class or can implement an interface but not both at a time.
 
 		For regular/normal class, we can write any number of constructors but we can’t write any constructor for anonymous Inner class
  because the anonymous class does not have any name so it is not possible.
 
 
 		C.
 		Method local inner class:
 				Inner class can be declared with in a method of an outer class is a  method local inner class.
 			
 			
 				class sk{
 					void sks()
 						{
 							class p{
 								void gp()
 									{
 										Sysytem.out.println("True");
 									}
 								}
 							p pp = new p();
 							pp.gp();
 						}
 						}
 				class sk1{
					public static void main(String args[]){
 						sk ss =new sk();
 						ss.sks();
 						}
 					}
 				
 */



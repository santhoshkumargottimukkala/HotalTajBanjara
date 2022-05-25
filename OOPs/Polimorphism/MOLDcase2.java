class MOLDcase2	//Ex: FaceBook login		
{
public static void login(Object a)		//1. same class or with in the class 
{
System.out.println("cool...!");			//2. same method name 
}
public static void login(String a)		//3. different arguments , no. of args and sequences by check formal args and actchual args
{
System.out.println("average....");
}
public static void login(float a,double b)		// "Object" is parent class/data type  of all other data types
{
System.out.println("better ....");			// only one object can use in args.
}
public static void login(String a,double b)
{						
System.out.println("noncence ....");
}

public static void main(String[] args)  
{
login(12);   			 // int converted into Object 		 it is know as auto promotion or type casting 

login("sks"); 			    // String to String

login("sks",'s');		      // String to String and char to double  

login(123,321);  			 // int converted into float and double
		
}
}


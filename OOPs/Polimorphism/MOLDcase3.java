class MOLDcase3	//Ex: FaceBook login		
{
public static void login(StringBuffer a)		//1. same class or with in the class 
{
System.out.println("cool...!");				//2. same method name 
}
public static void login(String a)			//3. different arguments , no. of args and sequences by check formal args and actchual args
{
System.out.println("average....");
}
public static void login(float a,double b)		// StringBuffer and StringBuilderare a part of String,High value prefor to String. 
{
System.out.println("better ....");			
}
public static void login(String a,double b)
{						
System.out.println("noncence ....");
}

public static void main(String[] args)  
{
login("sks");   						 // String converted into String		 (it is know as auto promotion or type casting) 

login(new StringBuffer("XYZZZZZZ......")); 			   // String to StringBuffer but adding StringBuffer constructor/function .

login("sks",'s');		   		 // String to String and char to double		  

login(123,321);   // int converted into float and double
		
}
}


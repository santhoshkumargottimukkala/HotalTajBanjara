class MOLDcase4	//Ex: FaceBook login		
{
public static void login(String... b)			//1. same class or with in the class 
{
System.out.println("cool...!");				//2. same method name 
}
public static void login(int... b)		//3. different arguments , no. of args and sequences by check formal args and actchual args
{
System.out.println("average....");
}
public static void login(float... a)		// varargs(variable arguments) multiple arguments either formal r actchual 
{
System.out.println("better ....");			// we can tack multiple actchual args but a single variable and single data type only in method block. 
}
public static void login(String... a,int... b)
{						
System.out.println("noncence ....");
}

public static void main(String[] args)  
{
login("iuehfiuhu","uhuh","jhfeiuhf","fgwyfwuehes","fudgwuugu");      // String converted into String		 (it is know as auto promotion or type casting) 

login(34,23,45,23,56,3,5); 						   // String to StringBuffer but adding StringBuffer constructor/function .

login(2.4,54.4,74574.4464,46.346436,4663.346.54436);		   				   // int converted into float and double

login("iuehfiuhu","uhuh","jhfeiuhf",321,242,23423,53252,23535,5325);  
		
}
}
/* a method that takes a variable number of arguments is known as varargs .

mainly use of It creates an array of parameters of unspecified length in the background 
and such a parameter can be treated as an array in runtime.

varargs used in abstract use the main method it self.




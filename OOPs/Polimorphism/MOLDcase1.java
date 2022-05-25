class MOLDcase1	//Ex: FaceBook login		
{
public static void login(long a,String b)	//1. same class or with in the class 
{
System.out.println("cool...!");			//2. same method name 
}
public static void login(String a,String b)	//3. different arguments , no. of args and sequences by check formal args and actchual args
{
System.out.println("average....");
}
public static void login(float a,double b)		
{
System.out.println("better ....");		
}
public static void login(String a,double b)
{						
System.out.println("noncence ....");
}

public static void main(String[] args)  
{
login("sks",123);    // int converted into double  		 it is know as auto promotion or type casting 

login(123,"sks");    // int converted into long

login(123,321);	      // int converted into float and double

login("gmk","sks");  
		
}
}

/* Type casting /pramotion 
 * 			it produce unexpected 
 * 			results when you are shifting lesser data type to larger data type
 * 			lower range value to higher range value or  is knowe as auto promotion.
 *
 *Upcasting :
 *		  A child/sub object to a parent/base object 
 *		
 *Syntax: Base_class_name Obj =(Base_class_name) new Sub_class_name();// here (Base_class_name) it will tack auto matically happen you can remove aslo work's .
 *		 
 *			Obj.Base_class_name();
 *		
 *			
 *eg:
 *		class parent {
 *			void prt(){
 *			Sopln("parent");}
 *			}
 *		class child {
 *		void prt(){
 *			Sopln("child");}
 *		void srt(){
 *			Sopln("child");}
 *		void nrt(){
 *			Sopln("child");}
 *		p s v m(S[] a){
 *		parent p = new child();
 *			p.prt();
 *			//p.srt	(); ,p.nrt(); both is not works why because both are not there in base class.
 *		}
 *		}
 *		by these we get sub class methods call hapend base class colapsed or it's not workout.
 *
 *Downcasting :
 *		 A parent/base object to a sub object 
 *
 *	eg:		
 *			class parent {
 *			void prt(){
 *			Sopln("parent");}
 *			}
 *		class child {
 *		void prt(){
 *			Sopln("child");}
 *		void srt(){
 *			Sopln("child");}
 *		void nrt(){
 *			Sopln("child");}
 *		p s v m(S[] a){
 *		parent p = new child();
 *			p.prt();
 *		
 *		child c = (child) p;// thise leads to down casting
 *		c.srt();
 *		c.nrt();
 *		}	
 *		}
 *
 */


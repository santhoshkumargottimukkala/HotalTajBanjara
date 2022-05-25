class MORRDcase7							// SYNCHRONIZED AND STRICTFP/STRICTLY
{
 	synchronized  void gautam()				// SYNCHRONIZED
{
System.out.println("natural");				//if it is used in super then we wiil use either defult/synchronized it get compiled
}			
	synchronized void gautam1()				// DEFAULT 	 	
{
System.out.println("nice");				// if it is used in super then we wiil use either defult/synchronized it get compiled
}							
	void gautam2()					
{								// STRICTFP
System.out.println("cool");			
}							// strictfp (strict floating point) it is changed in 17 so it used as "STRICTLY" but we have to give a veriable
	 void gautam3()					// to it , so it will tacks but i dont know how it is used in program.
{
System.out.println("peace");			
}
}

class Friends extends MORRDcase7
{
	 void gautam()
{
System.out.println("natural 1");
}
	
	synchronized void gautam1()				
{
System.out.println("nice 1");
}
	synchronized void gautam2()
{
System.out.println("cool 1");
}
	 void gautam3()
{
System.out.println("peace 1");
}
public static void main(String[] args)
{
Friends f = new Friends();					// we can create both objects compalsarily if either ststic use or not it's secoundary.
f.gautam();
f.gautam1();
f.gautam2();
f.gautam3();					

MORRDcase7 m = new MORRDcase7();
m.gautam();
m.gautam1();
m.gautam2();
m.gautam3();
}
}
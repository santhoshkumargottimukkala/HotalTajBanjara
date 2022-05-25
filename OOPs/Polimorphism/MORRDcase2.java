class MORRDcase2						// ACCESS MODIFIERS
{
	public void books()				//if parent is public compalsarily child should be public 
{							// default(super) is also default(sub)
System.out.println("papers...");
}
	protected void books1()					// if parent is protected/default(in super) then compalsarily public(sub) is also access
{
System.out.println("papers1...");
}
	void books2()					// if default in super then sub is protected
{
System.out.println("papers2...");
}
}

class Libreary extends MORRDcase2			// public to public
{
	public void books()				// protected to public 
{
System.out.println("papers3...");			// default to default/public/protected 
}
	public void books1()				// private genarates compile time error any where either super or sub
{
System.out.println("papers4...");
}
	protected void books2()
{
System.out.println("papers5...");
}

public static void main(String[]args)
{
Libreary l = new Libreary();
l.books();
l.books1();
l.books2();

MORRDcase2 m = new  MORRDcase2();
m.books();
m.books1();
m.books2();
}
}


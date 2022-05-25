class MORRDcase5							//INVOKING OVERRIDDEN METHOD FROM SUPER TO SUB CLASS BY super KEY WORD
{
public  void amardeep()				
{
System.out.println("Multi Talented");
}
public  void amardeep1()				//in super class methods transforing to sub class by the calling simetix by super key word.
{
System.out.println("Morvaless");
}
public void amardeep2()
{
System.out.println("Mind blowing");
}
public  void amardeep3()
{
System.out.println("Mind block");
}
}

class Friends extends MORRDcase5
{

public  void amardeep()
{
System.out.println("Multi Talented");
super.amardeep();
super.amardeep1();
super.amardeep2();			// we can exchange methods in super/sub also it will get compile.
super.amardeep3();			// it is mandetary to get invoking from super to sub-class 
}
public static void main(String[] args)
{
Friends f = new Friends();			//compalsarily we  create an object otherwise get an error
f.amardeep();
					// so it will get all in one object 
}
}
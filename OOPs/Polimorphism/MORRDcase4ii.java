interface Building						// INTERFACE IN OVERREDDEN 
{
public void rooms();
}					// in these method we can't give the static method either super or sub so it get's compile time error
interface Building1
{
public void bedRooms();
}
interface Building2
{
public void esculator();
}

class office implements Building,Building1,Building2
{
public void rooms()
{
System.out.println("leaving 1");
}
public void bedRooms()
{
System.out.println("sleep 1");
}
public void esculator()
{
System.out.println("going 1");
}
public static void main(String[] args)
{
office o = new office();
o.rooms();
o.bedRooms();
o.esculator();
}
}

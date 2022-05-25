class m2{
private int empid;
public void setEmpid(int eid){
empid=eid;
}
public int getEmpid(){
return empid;
}
}
class main
{
public static void m2(String[] args){
m2 a = new m2();
a.setEmpid(122);
System.out.println(a.getEmpid());

}

}
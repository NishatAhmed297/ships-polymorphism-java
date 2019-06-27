public class CruiseShip extends Ship		//inheritance 
{
String name;
int year;
int Max_passanger ;
public CruiseShip(String name, int year, int Max_passanger )
{
	super(name , year);					//parent class constructor
	setMaxPass(Max_passanger);
}
public void setMaxPass(int MP)
{ Max_passanger = MP ; }
public int getMaxPass()
{ return Max_passanger ; }
public String toString()
{ 	return "name : "+super.getname()+"\nMax Passanger : "+getMaxPass(); }

public static void main(String args[])
{
	CruiseShip CShip = new CruiseShip("Cruise_ship",1958,150);
	System.out.println(CShip);
}
}

public class CargoShip extends Ship     //inheritance
{
String name;
int year;
int Cargo_capacity ;
public CargoShip(String name, int year, int Cargo_capacity )
{
	super(name , year);     //parent class constructor is called
	setCC(Cargo_capacity);
}
public void setCC(int CC)    
{ Cargo_capacity = CC ; }
public int getCC()
{ return Cargo_capacity ; }
public String toString()       
{ 	return "name : "+super.getname()+"\nCargo Capacity : "+getCC()+" ton" ;}

}

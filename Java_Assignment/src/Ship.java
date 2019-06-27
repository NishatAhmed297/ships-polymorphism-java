public class Ship 
{
String name;
int year;
public Ship( String name , int year)
{
	setname(name);
	setyear(year) ;
}
public void setname(String n)
{	name =  n ;  }
public void setyear(int y)
{	year = y;  }
public String getname()
{	return name; }
public int getyear()
{	return year; }

public String toString()
{ return "Name : "+getname()+" Year : "+getyear() ; }

}
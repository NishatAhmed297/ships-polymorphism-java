public class Test_Class 
{
public static void main(String[] args) 
	{
		Ship[] Ship_arr = new Ship[2];             //Polymorphism            
		Ship_arr[0] = new CruiseShip("Cruise Ship" , 1958 ,125); 
		Ship_arr[1] = new CargoShip("Cargo Ship" , 1978 , 1500);
		for(int i=0 ; i<2 ; i++)
		{
		System.out.println(Ship_arr[i]);	//polymorphism = same method is defined in both classes but array
											//of parent class can call both objects and object is selected at the time of 
											//execution.
		}
	}
}

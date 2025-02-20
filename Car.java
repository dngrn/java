import java.util.*;

public class Car
{
	
	String brand;
	
	Car()
	{
	    brand="Mercedes-benz";
	}
	void setBrand()
	{
	    System.out.println(brand);
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the brand name: ");
	    brand=sc.nextLine();
	    System.out.println("New brand: "+brand+"-> MG cyberster");
	}
	
	public static void main(String args[])
	{
	 Car obj=new Car();
	 obj.setBrand();
	
}
}
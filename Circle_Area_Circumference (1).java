import java.util.*;

abstract class Circle_Area_Circumference
{
    static double area,circumference,r;
    
    
    static void get(int x)
    {
        r=x;
        System.out.println(r);
    }
    
    static void calc_area()
    {
     area=3.14*r*r;
     System.out.println("Area of circle: "+area);
        
    }
   
    
    
    static void calc_circumference()
    {
        circumference=2*3.14*r;
        System.out.println("area of circumference: "+circumference);
    }
    
    


	public static void main(String[] args)
	{

    get(32);
    calc_area();
    calc_circumference();

	}
}
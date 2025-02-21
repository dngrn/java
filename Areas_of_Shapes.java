 import java.util.*;
 
 class Areas_of_Shapes
{
    
    static int r,square,rectangle,a;
    static double triangle;
    
    static double Area(int r)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius: ");
        r=sc.nextInt();
        double circle=3.14*r*r;
        return circle;
    }
    
    static void Area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter area: ");
        a=sc.nextInt();
        square=a*a;
        System.out.println("Area of a square: "+square);
    }
    
    static void TriArea(int b,int h)
    {
        triangle=0.5*b*h;
        System.out.println("Area of triangle: "+triangle);    
        
    }
    
    static int Area(int len,int wid)
    {
        rectangle=len*wid;
        return rectangle;
    }
 
 
 
	public static void main(String[] args) {
	
	System.out.println("Area of circle: "+Area(32));
	
	Area();
	
    TriArea(12,32);	
    
	System.out.println("Area of rectangle: "+Area(32,12));


	
	}
	
	}

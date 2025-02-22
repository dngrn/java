import java.util.*;

 class Shape
{
    protected double area;
    
    public void calculate()
    {

     System.out.println("Area of shapes: "); 
    } 
}

class Circle extends Shape{
    
    public double calculate(double pi,int r)
    {
        area=pi*r*r;
        return (double)area;
    }
    
    
}
class Square extends Shape{
    
    public int calculate(int a)
    {
        area=a*a;
        return (int)area;
    }
    
    
}

public class Inheritance{

	public static void main(String[] args) {

    Circle obj=new Circle();
    Square o=new Square();
    
    System.out.println(obj.calculate(3.14,24));
    System.out.println(o.calculate(45));
    
	}
}
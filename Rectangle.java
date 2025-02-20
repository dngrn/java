
public class Rectangle
{
	

    int width,length;
    
    Rectangle(int width,int length)
    {
        this.width=width;
        this.length=length;
    }
    
    Rectangle(Rectangle r)
    {
        width=r.width;
        length=r.length;
    }
    void display()
    {
        System.out.println(width+" , "+length);
    }
    public static void main(String[] args) {
     
     Rectangle obj=new Rectangle(24,18);
     obj.display();
     
     Rectangle o=new Rectangle(17,22);
     o.display();


	}
}
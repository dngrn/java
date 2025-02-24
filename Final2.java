import java.util.*;

abstract class Final
{
	 final void display()
	{
		System.out.println("Its Final");
	}

}



public class Main extends Final
{
	final void display(int a,int b)
	{
        int c=a+b;
		System.out.println("sum: "+c);

	}
	public static void main(String[] args) {


		Main o=new Main();

		o.display();
		o.display(34,67);


	}
}
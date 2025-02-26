abstract class Outer
{
	abstract  class Inner
	{
		abstract void b();

		static void display()
		{
			System.out.println("InnerClass : Inner display method");

		}
	}
	abstract void a();

	static void display()
	{
		System.out.println("OuterClass : Inner display method");
	}
}

public class Abstract_class extends Outer
{
	public void a()
	{
		System.out.println("Outerclass Outer method");
	}
	public void b()
	{
		System.out.println("Innerclass Outer method");

	}

	public static void main(String[] args) {

		Abstract_class obj=new Abstract_class();
		Outer.display();
		Inner.display();
		obj.a();
		obj.b();
	}
}
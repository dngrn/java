
class Final
{
	final static class Inner
	{
		static void display(int a,int b)
		{
			int c=a+b;
			System.out.println(c);
		}

	}
}

	class InnerClass

	{


		public static void main(String[] args)
		{

			Final.Inner.display(11,27);
		}
	}




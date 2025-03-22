public class Automorphic
{
	public static void main(String[] args) {

		for(int n=1; n<=10000; n++)
		{
			int square=n*n;

			int original=n;
			int digit=1;

			while(original>0)
			{
				digit*=10;
				original/=10;
			}

			if(square % digit == n)
			{
				System.out.println(n);
			}
			

		}


	}
}
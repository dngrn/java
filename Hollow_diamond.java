
public class Hollow_diamond
{
	public static void main(String[] args) {
		int n=5;

		for(int i=1; i<n; i++)
		{
			for(int j=n-i; j>0; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i*2-1; k++)
			{
				if(i==n || k==1 || k==i*2-1)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for(int i=n; i>=0; i--)
		{
			for(int j=n-i; j>0; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i*2-1; k++)
			{
				if( k==1 || k==i*2-1)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
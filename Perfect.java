
public class Perfect
{
	public static void main(String[] args) {

		

		for(int n=1; n<=500; n++)
		{
		    		int sum=0;

		    int temp=n;
		    
			for(int i=1; i<temp; i++)
			{
				if(temp % i == 0)
				{
					sum+=i;
				}
			}

			if(sum==n)
			{
				System.out.println(n);
			}

			

		}
	}
}
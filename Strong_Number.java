
public class Strong_Number
{
	public static void main(String[] args) {
		int n=1500;
		for(int i=1;i<=n;i++)
		{
		    int temp=i;
            int sum=0;
		    while(temp>0)
		    {
		        
		        int digit=temp%10;
		        sum+=factorial(digit);
		        temp/=10;
		    }
		    if(sum==i)
		    {
		        System.out.println(i);
		    }
		}
		
	}
	public static int factorial(int num)
	{
	    
	    int fact=1;
	    for(int i=1;i<=num;i++)
	    {
	        fact*=i;
	    }
	    return fact;
	}
}
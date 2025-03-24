
public class Decimal_to_binary
{
	public static void main(String[] args) {
		int n=9;
		
		if(n==0)
		{
		    System.out.println(0);
		}
		
		
	    int binary[]=new int[32];
	    
	    int i=0;
	    
	    while(n>0)
	    {
	        binary[i++]=n % 2;
	        n/=2;
	        
	        
	       
	    }
	     for(int j=i-1;j>=0;j--)
	        {
	            System.out.print(binary[j]);
	        }
		    
		}
	}
import java.util.*;
class Prime_number
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	
	if(n<=1)
	  System.out.println("Not a prime number");
	else{
	    for(int i=2;i<=n;i++)
	    {
	        if(n%i==0){
	          System.out.println("Not a prime number");
	          break;
	        }
	        else{
	            System.out.println("prime number");
	            break;
	        }
	    }
	}
	
	
	
	    
	}
}
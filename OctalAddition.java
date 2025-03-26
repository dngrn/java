import java.util.*;
public class OctalAddition
{
	public static int OctalToDecimal(int octal){
		int decimal=0,base=1;
		
		while(octal>0)
		{
		    int lastdigit=octal%10;
		    decimal+=lastdigit*base;
		    base*=8;
		    octal/=10;
		}
		return decimal;
		
	}	
		
	public static int DecimalToOctal(int decimal){
	    

	    int	octal=0,base=1;
		
		while(decimal>0)
		{
		    int lastdigit=decimal%8;
		    octal+=lastdigit*base;
		    base*=10;
		    decimal/=8;
		    
		}
		return octal;
	}
	public static int AddOctal(int octal1,int octal2)
	{
	    int decimal1=OctalToDecimal(octal1);
	    int decimal2=OctalToDecimal(octal2);
	    int sum=decimal1+decimal2;
	    
	    int addition=DecimalToOctal(sum);
	    
	    return addition;
	 }
	 public static void main(String args[])
	 {
	     Scanner sc=new Scanner(System.in);
	     
	     int octal1=sc.nextInt();
	     int octal2=sc.nextInt();
	     
	     int result=AddOctal(octal1,octal2);
	     
	     System.out.println("Addition of two Octals: "+result);
	     
	     
	     
	 }
	 
	}

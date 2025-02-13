import java.util.*;
public class EOP_sum_reverse
{
    int esum=0,psum=0,osum=0;
static boolean evensum(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        else{
            return false;
        }
    }
static boolean oddsum(int n)
    {
        if(n%2!=0)
           return true;
        else
           return false;
        
    }
    
static boolean primesum(int n)
    {   
        boolean isprime=false;
            if(n==2)
            {
                isprime=true;
            }
            
            else{
                for(int i=2;i<n;i++)
                {
                if(n%i==0)
                {
                    isprime=false;
                    break;
                }
                else{
                    isprime=true;
                }
            }
        }
        if(isprime){
           return true;
        }
        else
           return false;
    }

  void reverse(int n){
      int rem,rev=0;
      while(n>0){
          rem=n%10;
          n=n/10;
          rev=(rev*10)+rem;
      }
      System.out.println(rev);
  }


public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    EOP_sum_reverse obj=new EOP_sum_reverse();
    int rem,esum=0,osum=0,psum=0;
    while(num>0)
     {
          rem=num%10;
          
          if(obj.evensum(rem))
            esum=esum*10+rem;
          if(obj.oddsum(rem))
            osum=osum*10+rem;
          if(obj.primesum(rem))
            psum=psum*10+rem;
          num/=10;
      }
	System.out.println("Sum of Digits");
	System.out.println("sum of even Numbers: "+esum);
	System.out.println("sum of odd Numbers: "+osum);
	System.out.println("sum of prime Numbers: "+psum);
    
    obj.reverse(esum);
    obj.reverse(osum);
    obj.reverse(psum);
		
		
		
	}
}
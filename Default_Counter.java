public class Default_Counter
{
    
    
    
    static int count=0;
    Counter()
    {
        count++;
        System.out.println("current count= "+count);
         

    }

    
	public static void main(String[] args) {
	    
	    Counter a=new Counter();
	    Counter b=new Counter();
        Counter c=new Counter();

	}
}
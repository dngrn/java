
-interface SBI
{
    void getInfo();
    long accountNum=720722104;
    double balance=109.00;
}

interface IndianBank
{
    
    String Branch="Kallal";
    String Manager="Parasuram";
   
   default void getIB()
   {
       System.out.println("Branch name: "+Branch+"\nManager name: "+Manager);
   }
}
interface CUB
{
     public void getCUB();
     static String location="Hyderabad";
     static long TurnOver=120000000;
     
    static void get()
    {
        System.out.println("Location: "+location+"\nTurn Over/Year: "+TurnOver);
    }
}



 class Banks implements SBI,IndianBank,CUB
{
    public void getCUB()
    {
        System.out.println("Bank : The CITY UNION BANK");
    }
    
    public void getInfo()
    {
        System.out.println("Account Number:  "+ accountNum +"\nBalance: "+ balance);
    }
    


    
	public static void main(String[] args) {
    
    

    Banks obj=new Banks();
    obj.getInfo();
    obj.getIB();
    
    obj.getCUB();
    CUB.get();
	    

		
		
	}
}
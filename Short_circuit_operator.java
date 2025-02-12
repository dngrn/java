class Short_circuit_operator
{
	public static void main(String[] args) {

   int a=5,b=6,c=7;
   
   if(a>b && a>c)
   {
       System.out.println(a);
   }
   
   else if(b>a && b>c)
   {
       System.out.println(b);
   }
   else{
       System.out.println(c);
   }



	}
}
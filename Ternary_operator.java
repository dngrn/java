class Ternary_operator
{
	public static void main(String[] args) {

   int a=52,b=43,c=67;
   
  int max=((a>b) && (a>c))?a:(b>c)?b:c;
  System.out.println(max);
	}
}
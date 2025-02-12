import java.util.*;
class Unary_operator
{
	public static void main(String[] args) {
	
	int x=10;
	
	int a=--x + --x + --x + --x;
	int b=x++ + ++x + ++x + x++ + ++x;
	System.out.println(a);
	System.out.println(b);
	
	    
	}
}
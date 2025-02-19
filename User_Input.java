import java.util.*;

public class User_Input
{
	public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    
    
    System.out.println("String(multiple): ");
    String c=sc.nextLine();

    System.out.println("Integer: ");
    int a=sc.nextInt();
    
    System.out.println("String(single): ");
    String b=sc.next();
    
    System.out.println("Character: ");
    char d=sc.next().charAt(0);

    System.out.println("Float: ");
    float e=sc.nextFloat();
     
    System.out.println("Double: ");
    double f=sc.nextDouble();


	}
}
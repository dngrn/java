import java.util.*;

public class Main
{
	public static void main(String[] args) {
     
    Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
    int a[][]=new int[n][2];
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
           a[i][j]=sc.nextInt();
            
        }
    }
    for(int i=0;i<n;i++)
    {
        int c=a[i][1];
        int d=a[i][0];
        
        while(c>0)
        {
            d*=d;
            c--;
        }
        System.out.println(d%10);
        }
	}
}
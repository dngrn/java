import java.util.*;
public class Random_order
{
	public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
    int arr[]=new int[n];
    
    for(int i=0;i<n;i++)
    {
       arr[i]=sc.nextInt();
    }
    int max=0,a=0,b=0,a1=0,b1=0;
    
    for(int i=0;i<n;i++)
    {
        for(int j=i;j<n;j++)
        {
            a=arr[i];
            b=arr[j];
            while(a>0)
            {
                a1=a;
                a=a/10;
            }
            while(b>0)
            {
                b1=b;
                b=b/10;
            }
            if(a1<b1 || (a1==b1 && arr[i]<arr[j] ))
            {
                max=arr[i];
                arr[i]=arr[j];
                arr[j]=max;
            }
        }
    }
    for(int i=0;i<n;i++)
      System.out.println(arr[i]);
	}
}
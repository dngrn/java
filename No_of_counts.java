import java.util.*;
public class No_of_counts
{
	public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    
    int size=sc.nextInt();
    int arr[]=new int[size];
    
    for(int i=0;i<size;i++)
    {
       arr[i]=sc.nextInt();
    }
    System.out.println("Enter the N value: ");
    int n=sc.nextInt();
    int count=0;
    for(int i=0;i<size;i++)
    {
        for(int j=i+1;j<size;j++)
        {
        for(int k=i+1;k<size;k++)
        {
        if(arr[i]+arr[j]+arr[k]==n)
        {
            count++;
        }
        }
    }
    
}
System.out.println(count);
        }
}
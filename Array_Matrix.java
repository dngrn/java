import java.util.*;
public class Array_Matrix
{
	public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.println("Rows & Columns: ");
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
          System.out.print(arr[i][j]+"\t");        
            
        }
        System.out.println();
    }
    
	    
	    
	    
	    
	    
	    
	}
}
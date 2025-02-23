import java.util.*;

public class Array_reversed
{
    
    static void reverse(int arr[],int start,int end)
    {
      int temp=arr[start];
      arr[start]=arr[end];
      arr[end]=temp;
  
      }
 
    
	public static void main(String[] args) {
	    
	    int arr[]={1,2,5,6,3,8,9,4};
	    int start=0;
	    int end=arr.length-1;
	    
	    
	    System.out.println("Normal: ");
	    
	    for(int i=0;i<arr.length;i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
	    System.out.println();
	    
	    while(start<end)
        {
            reverse(arr,start,end);
            start++;
	        end--;
	    }
	     System.out.println("Reversed: ");
	    
	    for(int i=0;i<arr.length;i++)
	    {
	        System.out.print(arr[i]+" ");
	    }

	    
	}
}
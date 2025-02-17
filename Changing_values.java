import java.util.*;

public class Changing_values {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i:arr){
            i++;
          System.out.println(i);
          
        }
        
        for(int i=0;i<arr.length;i++)
        {
           arr[i]++;
           System.out.println(arr[i]);
        }
        for(int i=0;i<arr.length;i++)
           System.out.println(arr[i]);
           
        for(int j=arr.length-1;j>=0;j--)
          System.out.println(arr[j]);
        }
    }


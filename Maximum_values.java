import java.util.*;

public class Maximum_values {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int max=arr[0],secmax=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
              max=arr[i];
        }
        System.out.println(max);
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]>secmax && arr[j]<max)
               secmax=arr[j];
        }
        System.out.println(secmax);
        
        Arrays.sort(arr);
        int last=arr.length-1;
        
        System.out.println(arr[last-2]);
        }
    }


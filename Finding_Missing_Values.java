
public class Finding_Missing_Values
{
	public static void main(String[] args) {

    int arr[]={2,4,6,8,10,12,14,16};
    int m=5,n=55;
    int arr2[];
    
    for(int i=m;i<n;i++)
    {
    for(int k=0;k<arr.length;k++)
    {
        if(i!=arr[k])
        {
            System.out.println("["+i+"]");
        }
    }
    
    
    
     System.out.println();
    }

	}
}

public class Max_count_values
{
	public static void main(String[] args) {

    int arr[]={1,1,0,1,1,0,0,1,0,1,1,1,0};
    int count=0;
    
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==0)
        {
            count++;
            for(int j=i;j<arr.length;j++)
            {
                if(j!=arr.length-1)
                   arr[j]=arr[j-1];
            }
        }
    
    }

    for(int i=0;i<arr.length;i++)
       System.out.print(arr[i]);

	}
}
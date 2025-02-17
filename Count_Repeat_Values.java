
public class Count_Repeat_Values
{
	public static void main(String[] args) {

    int arr[]={1,3,4,5,0,6,7,9,0,5,0,3};
    int count=0;
    
    for(int i=0;i<arr.length;i++)
    {
        count=0;
        if(arr[i]!=-1)
        {
            
            count++;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    arr[j]=-1;
                }
            }
        System.out.println(arr[i]+":"+count);

            
        }

    
     }
      
	}
}
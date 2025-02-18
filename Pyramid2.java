
public class Pyramid2
{
	public static void main(String[] args) {

    int n=6,num=1;
    
    for(int i=1;i<n;i++)
    {
        for(int j=n-i-1;j>=0;j--)
        {
            System.out.print(" ");
        }
        for(int k=0;k<=2*i-1;k++)
        {
            if(k==1 || k==2*i-1)
               System.out.print("1");
            else if(k%2==0)
               System.out.print(" ");
            else
                System.out.print(num-1);
            
            
        }
        num++;
        System.out.println();
    }

	}
}

public class Frequency_String
{
	public static void main(String[] args) {
    
    String s="bheem bheem bheem chotta bheem chotta bheem";
    String a[]=s.split(" ");
    
    for(int i=0;i<a.length;i++)
    {
        if(a[i]!=null)
        {
            int count=1;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]!=null)
                {
                    if(a[i].equals(a[j]))
                    {
                        count++;
                        a[j]=null;
                    }
                }
            }
            System.out.println(a[i]+" : "+count);
        }
    }
    


	}
}
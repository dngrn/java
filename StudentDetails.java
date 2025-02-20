import java.util.*;
 class Student_Details
{
   
    
    public void input(String[] name,int[] regno,String Sname,int reg, int i,int n)
    {
          
           name[i]=Sname;
           regno[i]=reg;
       
    }
    public void display(int n,String[] name,int[] regno)
    {
        for(int i=0;i<n;i++){
           if(i==0)
              System.out.println("Its me "+name[i]+" and Rollno: "+regno[i]);
           else if(i==1)
              System.out.println(name[i]+" Ramesh Reddy and Rollno: "+regno[i]);
           else if(i==2)
              System.out.println(name[i]+" From Ramnad and Rollno: "+regno[i]);
           else if(i==3)
              System.out.println(name[i]+" engira raasu "+" and Rollno: "+regno[i]);   
           else 
              System.out.println("En peru SL "+name[i]+" En ooru kanyakumari and Rollno: "+regno[i]);
        }
    }
}
public class StudentDetails{
    
    public static void main(String[] args){

      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter No of times: ");
      int n=sc.nextInt();
      sc.nextLine();
      
      Student_Details obj=new Student_Details();
      
      int[] regno=new int[n];
      String[] name=new String[n];
      
      
     for(int i=0;i<n;i++){
	    System.out.println("Enter your name: ");    
        String Name=sc.nextLine();
        System.out.println("Enter your Reg-No: ");    
        int Regno=sc.nextInt();
        sc.nextLine();
        obj.input(name,regno,Name,Regno,i,n);
     }
        
      
       
       
        obj.display(n,name,regno);
	    
     
	    
	    
	    
 	}
}


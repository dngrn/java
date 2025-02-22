
class Parent
{
    public int publicMethod()
    {
        int a=1;
        return a;
    }
    
    private int privateMethod()
    {
        int b=2;
        return b;
    }
    static  int staticMethod()
    {
        int c=3;
        return c;
    }
    
    protected int protectedMethod()
    {
        int d=4;
        return d;
    }
    
     int defaultMethod()
    {
        int e=5;
        return e;
    }
    
   int get()
    {
        return protectedMethod();
    }
    
}
class child extends Parent
{
    public int publicMethod()
    {
        int f=6;
        return f;
    }
    
    int defaultMethod()
    {
        int g=7;
        return g;
    }
    
     protected int protectedMethod()
    {
        int h=8;
        return h;
    }
}

public class Methods
{
	public static void main(String[] args) {
	  
	    
	    Parent ob=new Parent();
	    System.out.println(ob.publicMethod());
	    System.out.println(ob.staticMethod());
	    System.out.println(ob.defaultMethod());
	    System.out.println(ob.protectedMethod());



	    
	    child obj=new child();
	    System.out.println(obj.get());
	    System.out.println(obj.publicMethod());
	    System.out.println(obj.defaultMethod());
	    System.out.println(obj.protectedMethod());

	    
	}
}
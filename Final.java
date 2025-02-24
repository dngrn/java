// create an abstract class that sholud be final and static,that should not be initialized during declaration
//create an abstract class which is having final method and using the same name performing diff functionality in the derived class
//create an inner class

import java.util.*;

abstract class Final 
{
    final static int get_a();
    static void display
    final int variable;
    Final()
    {
      variable=30;
    }
}

public class Main extends Final
{
    Main()
    {
        super();
    }
    public static void main(String args[])
    {
        Main obj=new Main();
        System.out.println(obj.variable);
    }
}























import java.util.*;

public class Book2
{
    String title;
    String author;
    String slogan;
    int price;
    
    Book2(String title,String author,String slogan,int price)
    {
        this.title=title;
        this.author=author;
        this.slogan=slogan;
        this.price=price;
    }
    
    public void display()
    {
        System.out.println("The book is named: "+title+"\n written by: "+author+"\n Slogan of book: "+ slogan +"\n It costs: "+price);
    }
    
    
	public static void main(String[] args) {
	    
	    Book2 obj=new Book2("The vampire diaries","Beloved vampire","your blood smells good",1999);
	    obj.display();
	    
	}
}
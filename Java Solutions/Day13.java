import java.util.Scanner;

public class Day13 {
	
	abstract class Book
	{
	    String title;
	    String author;
	    Book(String t,String a){
	        title=t;
	        author=a;
	    }
	    abstract void display();
	}
	
	private class MyBook extends Book {
	    int price;
	    
	    public MyBook(String title, String author, int price){
	        super(title, author);
	        this.price = price;
	    }
	    
	    public void display() {
	        System.out.println("Title: " + this.title);
	        System.out.println("Author: " + this.author);
	        System.out.println("Price: " + this.price);
	    }
	}
	
	public static void main(String []args)
	   {
	      Scanner scanner = new Scanner(System.in);
	      String title = scanner.nextLine();
	      String author = scanner.nextLine();
	      int price = scanner.nextInt();
	      Book new_novel = new MyBook(title,author,price);
	      new_novel.display();
	      scanner.close();
	   }
}

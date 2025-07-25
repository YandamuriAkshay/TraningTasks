package task2;

public class Book {
	String title;
	String author;
	double price;
	
	void displaydetails() {
		System.out.println("Title :" + title);
		System.out.println("Author :" + author);
		System.out.println("Price :" + price);
		
		System.out.println("------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		
		b1.title = "Java";
		b1.author = "Ganesh";
		b1.price = 499.50;
		
		Book b2 = new Book();
		
		b2.title = "Selenium";
		b2.author = "Akki";
		b2.price = 5000.56;
		
		b1.displaydetails();
		b2.displaydetails();
	}

}

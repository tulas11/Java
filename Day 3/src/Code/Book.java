package Code;

public class Book {

	private int bookid;
	private String bookName, bookAuthor;
	private double price;

	// note:methods needs to be called explicitly

	public void assignBook() {
		System.out.println("---assignBook-");

	}
	// Constructor
	// get invoked implicitly as soon as new get execute

	// how to write
	// constructor name must be same as class name
	// no return data type not even void
	public Book() {
		System.out.println("-----default Constr Of Book Class");

		bookid = 101;
		bookName = "Java";
		bookAuthor = "Joshi";
		price = 200;

	}

	public void display() {
		System.out.println(bookid + "   " + bookName + "  " + bookAuthor + "    " + price);
	}

}
//Create Book class  (in code package) with data member bookId,name,author,price.
//Add both default and parameter constructor.Write getters and setters for all data members.
//Write Display Method for displaying all data members.
//Create TestBook class(in tester package)
//Create 2 objects of Book class by invoking default and parameter constr and display details of book.
package Code;

public class BookHW {
	private int bookID;
	private String name;
	private String author;
	private int price;

	public BookHW() {
		this.bookID = 1;
		this.name = "Start with WHY?";
		this.author = "Anonymous";
		this.price = 100;
	}

	public BookHW(int bookID, String name, String author, int price) {
		this.bookID = bookID;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public void Display() {
		System.out.println("BookId" + bookID + "Name" + name + "Author" + author + "Price" + price);
	}

	public int getbookID() {
		return bookID;
	}

	public String getname() {
		return name;
	}

	public String getauthor() {
		return author;
	}

	public int getprice() {
		return price;
	}

	public void setbookID(int bookID) {
		this.bookID = bookID;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setauthor(String author) {
		this.author = author;
	}

	public void setprice(int price) {
		this.price = price;
	}

}

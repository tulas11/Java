//Create a class Book with data members as bname,id,author,price.  
//Also add the display function.  
//Create the object of this class in main method and invoke all the methods in that class. 

package package21;

public class Book {

	private String bname;
	private int id;
	private String author;
	private int price;

	public Book(String bname, int id, String author, int price) {
		this.bname = bname;
		this.id = id;
		this.author = author;
		this.price = price;
	}

	public Book() {
		this.bname = "Default";
		this.id = 1;
		this.author = "J.K.Rowling";
		this.price = 1000;
	}

	public void display() {
		System.out.println("Bname:" + bname + " ID:" + id + " Author:" + author + " Price:" + price);
	}

	public String getbname() {
		return bname;
	}

	public void setbname(String bname) {
		this.bname = bname;
	}

}

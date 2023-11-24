package package21;

public class TesterForBook {

	public static void main(String[] args) {
		Book b1 = new Book(); // default constructor
		b1.display();
		Book b2 = new Book("5 AM Club", 101, "Robin Sharma", 1500);
		b2.display();
		b2.getbname();
		b2.display();
		b2.setbname("Leader who had no title");
		b2.display();

	}

}

package package21;

public class TesterForDate {

	public static void main(String[] args) {
		Date d1 = new Date(11, 11, 1999); // parameterized constructor gets called.
		Date d2 = new Date(); // default constructor gets called.

		d1.display();

		d1.setdd(12);
		d1.display();

		d1.setmm(12);
		d1.display();

		d1.setyy(2023);
		d1.display();

		d1.getdd();

	}

}

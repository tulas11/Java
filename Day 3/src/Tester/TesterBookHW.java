package Tester;

import Code.BookHW;

public class TesterBookHW {

	public static void main(String[] args) {
		BookHW b1 = new BookHW();
		b1.getauthor();
		
		b1.Display();
		BookHW b2 = new BookHW();
		b2.Display();
		b2.setname("Norwegian Wood");
		b2.Display();
	}

}

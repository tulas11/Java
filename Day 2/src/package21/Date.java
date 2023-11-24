//Create a class Date with data members as dd, mm, yy. Write getters and setters for all the data members.
//Also add the display function. 
//Create the object of this class in main method and invoke all the methods in that class. 
package package21;

public class Date {
	private int dd;
	private int mm;
	private int yy;

	public Date() {
		this.dd = 01;
		this.mm = 01;
		this.yy = 2000;
	}

	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public int getdd() {
		return dd;
	}

	public int getmm() {
		return mm;
	}

	public int getyy() {
		return yy;
	}

	public void setdd(int dd) {
		this.dd = dd;
	}

	public void setmm(int mm) {
		this.mm = mm;
	}

	public void setyy(int yy) {
		this.yy = yy;
	}

	public void display() {
		System.out.println("The date is: " + dd + "/" + mm + "/" + yy);

	}

}

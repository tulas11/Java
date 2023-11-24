//Create a class Point with data members as x,y. Create Default and Parameterized constructors. 
//add the display function. 
//Create the object of this class in main method and invoke all the methods in that class. 

package package21;

public class Point {
	private int x;
	private int y;

	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void display() {
		System.out.println("X:" + x + " Y:" + y);
	}

public static void Main (String[] args) {
	Point p1=  new Point();
	p1.display();
	
	Point p2 = new Point(10,20);
	p2.display();
}
}
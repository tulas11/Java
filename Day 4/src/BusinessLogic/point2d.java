//1.1:Create a class Point2D ,    : for representing a point in x-y co-ordinate system.
//
//1.2 Create a parameterized constructor to initialize x & y co-ords.
//
//1.3 Add a method toString return string form of  point's x & y co-ords
//
//1.4 Create a tester class and test Point2D class.
//1.5 Create a array to store 5 objects.Create menu driven program 
//    1:show all 2:add new 
package BusinessLogic;

public class point2d {

	private int x;
	private int y;

	public point2d() {
		this.x = 0;
		this.y = 0;
	}

	public point2d(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public point2d(double x2, double y2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
//		System.out.println("X:" + x + "Y:" + y);
		return "point2d ("+x + "," +y+ ")";
	}
	
	 
	
}

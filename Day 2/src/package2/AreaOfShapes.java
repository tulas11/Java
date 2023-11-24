//Write a menu driven program to do following operations :
//a) Compute area of circle
//b) Compute area of rectangle
//c) Compute area of triangle
//d) Exit
//Display menu, ask choice to the user, depending on choice accept the parameters and perform the 
//operation. Continue this process until user selects exit option.
package package2;

import java.util.Scanner;

public class AreaOfShapes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1 Area of Circle");
			System.out.println("2 Area of Rectangle");
			System.out.println("3 Area of Triangle");
			System.out.println("4 Exit");
			System.out.println("The number you want area of: ");
			int number = sc.nextInt();
			switch (number) {
			case 1:
				System.out.println("Enter the radius of circle");
				int r = sc.nextInt();
				double result = Math.PI * r * r;
				System.out.println("Area: " + result);
				break;
			case 2:
				System.out.println("Enter the length of rectangle");
				int l = sc.nextInt();
				System.out.println("Enter the breadth of rectangle");
				int b = sc.nextInt();
				System.out.println("Area: " + (l * b));
				break;
			case 3:
				System.out.println("Enter the height of triangle");
				int h = sc.nextInt();
				System.out.println("Enter the breadth of triangle");
				int bb = sc.nextInt();
				System.out.println("Area: " + (1 / 2 * bb * h));
				break;
			case 4:
				System.out.println("Exit");
				System.exit(0);

			}
		}

	}

}

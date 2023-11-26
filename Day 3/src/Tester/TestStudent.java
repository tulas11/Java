package Tester;

import java.util.Scanner;

import Code.Student;

public class TestStudent {

	public static void main(String[] args) {

		int r = 1;// local variable
		String nm = "abc", quali = "BE";
		double a = 10, b = 20, c = 30;

		Student studObj1;// local

		// studObj get created on stack
		// allocate memory for storing data members of Student
		// memory will get allocated on heap
		// HOw:by using new keyword
		studObj1 = new Student();

		studObj1.display();
		studObj1.assignDetails(r, nm, quali, a, b, c);
		studObj1.display();

		System.out.println("----Do You want To Add New Student:(Y/N)");

		Scanner sc = new Scanner(System.in);

		char ch;
		ch = sc.next().charAt(0);

		if (ch == 'Y') {
			System.out.println("Enter Rollno name quali m1 m2 m3");

			r = sc.nextInt();
			nm = sc.next();
			quali = sc.next();
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			// create new object of Student class
			Student studObj2 = new Student();
			studObj2.assignDetails(r, nm, quali, a, b, ch);
			 
			studObj2.display();
			

		}

		System.out.println("----end main----");
	}

}
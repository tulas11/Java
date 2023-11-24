//1:Write a program to create student class with data members rollno, marks1,mark2,mark3.
//Accept data (acceptInfo()) and display  using display member function.
//Also display total,percentage and grade.

package package21;

import java.util.Scanner;

class Student {
	int rollno;
	float marks1, marks2, marks3;
	Scanner sc = new Scanner(System.in);

	void acceptInfo() {
		System.out.print("Enter the rollo: ");
		int rollno = sc.nextInt();
		System.out.print("Enter the marks1: ");
		int marks1 = sc.nextInt();
		System.out.print("Enter the marks2: ");
		int marks2 = sc.nextInt();
		System.out.print("Enter the marks3: ");
		int marks3 = sc.nextInt();
	};

	void display() {
		System.out.println("Roll Number: " + rollno);
		System.out.println("Marks for Subject 1: " + marks1);
		System.out.println("Marks for Subject 2: " + marks2);
		System.out.println("Marks for Subject 3: " + marks3);

		float total = marks1 + marks2 + marks3;
		float percentage = (total / 300) * 100;

		System.out.println("Total Marks: " + total);
		System.out.println("Percentage: " + percentage + "%");

		char grade;
		if (percentage >= 90) {
			grade = 'A';
		} else if (percentage >= 80) {
			grade = 'B';
		} else if (percentage >= 70) {
			grade = 'C';
		} else if (percentage >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("Grade: " + grade);
	};

    public static void main(String[] args) {
        Student student = new Student();
        
        student.acceptInfo();

        student.display();
    }
}
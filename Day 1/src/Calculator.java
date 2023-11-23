//Write a program, which accepts two integers and an operator as a character (+ - * / ),
//performs the corresponding operation and displays the result.

import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two number with spaces: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		char operator = sc.next().charAt(0);
		switch (operator)
		{
		case '+':
			System.out.println("Addition: "+(num1+num2));
			break;
		case '-':
			System.out.println("Subtraction: "+(num1-num2));
			break;
		case '*':
			System.out.println("Multiplication: "+(num1*num2));
			break;
		case '/':
			System.out.println("Division: "+(num1/num2));
			break;
		case 'Q':
			System.out.println("Quit");
			break;
			
		}
			

	}

}

//:Write a program to find greatest of three numbers using nested if-else.
import java.util.Scanner;

public class LargestAmongThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 numbers adding spaces");
		
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int num3= sc.nextInt();
		
		if (num1>num2 && num1>num3)
			System.out.println(num1 + " Number is greater");
		else if (num2>num3)
			System.out.println(num2 + " Number is greater");
		else 
			System.out.println(num3 + " Number is greater");
		

	}

}

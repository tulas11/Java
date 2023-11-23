//Write a program to accept an integer and check if it is even or odd.
import java.util.Scanner;
public class Even_Odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check even odd");
		int num = sc.nextInt();
		if (num%2==0)
			System.out.println("Even number "+num);
		else 
			System.out.println("Odd number "+num);
	}

}

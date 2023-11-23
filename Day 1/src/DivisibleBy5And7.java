import java.util.Scanner;
public class DivisibleBy5And7 {

	public static void main(String[] args) {
		System.out.println("Number to be checked: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num%5==0 && num%7==0)
			System.out.println("Divisible");
		else
			System.out.println("Not Divisible");
	}

}

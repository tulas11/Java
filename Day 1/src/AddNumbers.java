import java.util.Scanner;
public class AddNumbers {

	public static void main(String[] args) {
		System.out.println("Enter the two number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("Addition "+(a+b));
		System.out.println("Addition "+a+b); //concatenate the two numbers

	}

}

//Write a  program to enter a number and print its reverse.
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversedNumber = reverseNumber(number);

        System.out.println("Reverse of " + number + " is: " + reversedNumber);

        scanner.close();
    }
    private static int reverseNumber(int n) {
        int reversedNumber = 0;

        while (n != 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n /= 10;
        }

        return reversedNumber;
    }
}

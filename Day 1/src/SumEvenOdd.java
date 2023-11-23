import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                // Even number
                sumEven += i;
            } else {
                // Odd number
                sumOdd += i;
            }
        }

        System.out.println("Sum of even numbers from 1 to " + n + ": " + sumEven);
        System.out.println("Sum of odd numbers from 1 to " + n + ": " + sumOdd);

        scanner.close();
    }
}

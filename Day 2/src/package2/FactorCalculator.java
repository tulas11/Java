//Write a program to calculate factors of a given number.
package package2;

import java.util.Scanner;

public class FactorCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        System.out.println("Factors of " + number + " are:");
        calculateAndPrintFactors(number);

        scanner.close();
    }

    private static void calculateAndPrintFactors(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

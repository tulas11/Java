//Write a program that accepts numbers continuously as long as the number is positive and prints the 
//sum of the given numbers.
package package2;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sumOfNumbers = 0;

        System.out.println("Enter positive numbers. Enter a non-positive number to stop.");

        while (true) {
            System.out.print("Enter a number: ");
            double number = sc.nextDouble();

            if (number <= 0) {
                break;
            }

            sumOfNumbers += number;
        }

        System.out.println("Sum of the given numbers: " + sumOfNumbers);
        sc.close();
    }
}

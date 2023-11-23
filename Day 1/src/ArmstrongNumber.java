import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNumber, remainder, result = 0, n = 0;

        // Assigning the value of num into variable originalNumber
        originalNumber = num;

        // Counting the number of digits using a while loop
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = num; // Restoring originalNumber

        // Computing the result using a while loop
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // Checking if num is equal to the result
        return result == num;
    }
}

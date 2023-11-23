//Write a program to find factorial of a given number. 
//ex:no5  fact=5*4*3*2*1=120
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to find factorial: ");
        int number = sc.nextInt();
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);

        sc.close();
    }
}

//Write a program to accept a character, an integer n and display the next n characters.
package package2;

import java.util.Scanner;

public class NextCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = sc.next().charAt(0);

        System.out.print("Enter the number of characters to display (n): ");
        int n = sc.nextInt();

        displayNextCharacters(inputChar, n);

        sc.close();
    }

    private static void displayNextCharacters(char startChar, int n) {
        System.out.println("Next " + n + " characters:");

        for (int i = 0; i < n; i++) {
            char nextChar = (char) (startChar + i);
            System.out.print(nextChar + " ");
        }

        System.out.println(); 
    }
}

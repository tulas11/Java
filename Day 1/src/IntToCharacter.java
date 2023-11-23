//Accept a single digit from the user and display it in words. 
//For example, if digit entered is 9, display Nine.
import java.util.Scanner;

public class IntToCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single digit (0-9): ");
        int digit = scanner.nextInt();

        if (digit >= 0 && digit <= 9) {
            String digitInWords = convertToWords(digit);
            System.out.println("The digit " + digit + " in words is: " + digitInWords);
        } else {
            System.out.println("Invalid input. Please enter a single digit (0-9).");
        }
    }

    public static String convertToWords(int digit) {
        switch (digit) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return "";
        }
    }
}

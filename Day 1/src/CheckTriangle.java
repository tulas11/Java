//Write a C program to input angles of a triangle and check whether 
//triangle is valid or not.
import java.util.Scanner;

public class CheckTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input angles from the user
        System.out.print("Enter the first angle: ");
        float angle1 = scanner.nextFloat();

        System.out.print("Enter the second angle: ");
        float angle2 = scanner.nextFloat();

        System.out.print("Enter the third angle: ");
        float angle3 = scanner.nextFloat();

        // Check if the angles form a valid triangle
        if (isTriangleValid(angle1, angle2, angle3)) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid. The sum of angles should be 180 degrees.");
        }

        scanner.close();
    }
    private static boolean isTriangleValid(float angle1, float angle2, float angle3) {
        return (angle1 + angle2 + angle3 == 180);
    }
}

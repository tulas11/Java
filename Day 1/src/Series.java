import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        int sum = n * (n + 1) / 2;

        System.out.println("Sum of the series is: " + sum);

    
    }
}

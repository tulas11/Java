//Create menu driven program for Pizza Shop. And display total amount
import java.util.Scanner;
public class PizzaShop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double totalAmount=0.0;
		
		while (true) {
			System.out.println("Pizza Shop Menu:");
            System.out.println("1. Margherita Pizza - $8.99");
            System.out.println("2. Pepperoni Pizza - $10.99");
            System.out.println("3. Veggie Supreme Pizza - $12.99");
            System.out.println("4. Custom Pizza - $15.99");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");	
            
            System.out.print("Enter your choice (1-6): ");
            int choice = sc.nextInt();
            
            switch (choice) {
            case 1:
                totalAmount += 8.99;
                System.out.println("Margherita Pizza added to your order.");
                break;
            case 2:
                totalAmount += 10.99;
                System.out.println("Pepperoni Pizza added to your order.");
                break;
            case 3:
                totalAmount += 12.99;
                System.out.println("Veggie Supreme Pizza added to your order.");
                break;
            case 4:
                totalAmount += 15.99;
                System.out.println("Custom Pizza added to your order.");
                break;
            case 5:
                System.out.println("Total Amount: $" + totalAmount);
                break;
            case 6:
                System.out.println("Thank you for ordering from Pizza Shop. Exiting...");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 6.");
		}
	}
}
}
		


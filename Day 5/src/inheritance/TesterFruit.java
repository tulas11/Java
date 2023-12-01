package inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesterFruit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be added into basket:");
		int basketsize = sc.nextInt();
		List<Fruit> basket = new ArrayList<>();

		for (int i = 0; i < basketsize; i++) {
			System.out.println("Choose a fruit to add:");
			System.out.println("1. Mango");
			System.out.println("2. Orange");
			System.out.println("3. Apple");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				basket.add(new Mango("Yellowish-Orange", 110, "Mango", true));
				break;
			case 2:
				basket.add(new Orange("Orange", 111, "Orange", true));
				break;
			case 3:
				basket.add(new Apple("Red", 99, "Apple", true));
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
		System.out.println("Names of all fruits in the basket:");
		for (int i = 0; i < basket.size(); i++) {
			System.out.println((i + 1) + ". " + basket.get(i).getName());
		}
		System.out.println("\nDetails of all fresh fruits in the basket:");
		for (Fruit fruit : basket) {
			if (fruit.getFresh()) {
				System.out.println(fruit.toString() + ", Taste: " + fruit.taste());
			}
		}

		System.out.print("\nEnter the index to mark a fruit as stale: ");
		int staleIndex = sc.nextInt();
		markAsStale(basket, staleIndex);

		markSourAsStale(basket);

		System.out.print("\nEnter the index to invoke specific functionality: ");
		int functionalityIndex = sc.nextInt();
		invokeFunctionality(basket, functionalityIndex);

	}

	private static void markAsStale(List<Fruit> basket, int index) {
		if (index >= 1 && index <= basket.size()) {
			basket.get(index - 1).setFresh(false);
			System.out.println("Fruit marked as stale: " + basket.get(index - 1).getName());
		} else {
			System.out.println("Invalid index. Cannot mark as stale.");
		}
	}

	private static void markSourAsStale(List<Fruit> basket) {
		for (Fruit fruit : basket) {
			if ("sour".equals(fruit.taste())) {
				fruit.setFresh(false);
				System.out.println(fruit.getName() + " marked as stale because it's sour.");
			}
		}
		System.out.println("All sour fruits marked as stale.");
	}

	private static void invokeFunctionality(List<Fruit> basket, int index) {
		if (index >= 1 && index <= basket.size()) {
			Fruit fruit = basket.get(index - 1);
			if (fruit instanceof Mango) {
				((Mango) fruit).pulp();
			} else if (fruit instanceof Orange) {
				((Orange) fruit).juice();
			} else if (fruit instanceof Apple) {
				((Apple) fruit).jam();
			} else {
				System.out.println("Functionality not available for this fruit.");
			}
		} else {
			System.out.println("Invalid index. Cannot invoke functionality.");
		}
	}
}

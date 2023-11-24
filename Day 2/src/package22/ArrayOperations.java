package package22;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

	private int[] array;
	private int size;

	public ArrayOperations(int capacity) {
		this.array = new int[capacity];
		this.size = 0;
	}

	public void showArray() {
		System.out.println("Array: " + Arrays.toString(Arrays.copyOf(array, size)));
	}

	public void addElement(int element) {
		if (size < array.length) {
			array[size++] = element;
			System.out.println("Element added successfully.");
		} else {
			System.out.println("Array is full. Cannot add more elements.");
		}
	}

	public void searchElement(int element) {
		boolean found = false;
		for (int i = 0; i < size; i++) {
			if (array[i] == element) {
				System.out.println("Element found at index " + i);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Element not found in the array.");
		}
	}

	public void doubleArrayElement() {
		for (int i = 0; i < size; i++) {
			array[i] *= 2;
		}
		System.out.println("All elements doubled successfully.");
	}

	public void sortArray() {
		Arrays.sort(array, 0, size);
		System.out.println("Array sorted successfully.");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the capacity of the array: ");
		int capacity = scanner.nextInt();

		ArrayOperations arrayOperations = new ArrayOperations(capacity);

		int choice;
		do {
			System.out.println("\nMenu:");
			System.out.println("1: Show Array");
			System.out.println("2: Add Element");
			System.out.println("3: Search Element");
			System.out.println("4: Double Array Elements");
			System.out.println("5: Sort Array");
			System.out.println("0: Exit");

			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				arrayOperations.showArray();
				break;
			case 2:
				System.out.print("Enter the element to add: ");
				int elementToAdd = scanner.nextInt();
				arrayOperations.addElement(elementToAdd);
				break;
			case 3:
				System.out.print("Enter the element to search: ");
				int elementToSearch = scanner.nextInt();
				arrayOperations.searchElement(elementToSearch);
				break;
			case 4:
				arrayOperations.doubleArrayElement();
				break;
			case 5:
				arrayOperations.sortArray();
				break;
			case 0:
				System.out.println("Exiting the program.");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}

		} while (choice != 0);

		scanner.close();
	}
}

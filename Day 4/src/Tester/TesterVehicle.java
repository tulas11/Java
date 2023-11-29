package Tester;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import BusinessLogic.vehicle;

public class TesterVehicle {
	static ArrayList<vehicle> arr = new ArrayList<>(5);
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.print("Enter 1,2,3,4,5:");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				showAll();
				break;
			case 2:
				addVehicle();
				break;
			case 3:
				editColour();
				break;
			case 4:
				editPrice();
				break;
			case 5:
				remove();
				break;
			}
		}

	}

	private static void showAll() {
		for (vehicle obj : arr)
			System.out.println(obj);
	}

	private static void addVehicle() {
		System.out.print("Id:");
		int id = sc.nextInt();
		System.out.print("Name:");
		String name = sc.next();
		System.out.print("Colour");
		String colour = sc.next();
		System.out.print("Price");
		int pprice = sc.nextInt();
		vehicle newvehicle = new vehicle(id, name, colour, pprice);
		arr.add(newvehicle);
	}

	private static void editColour() {
		System.out.print("Enter vehicle ID to edit price: ");
		int id = sc.nextInt();

		for (vehicle vobj : arr) {
			if (vobj.getId() == id) {
				System.out.print("Enter new colour: ");
				String newColour = sc.next();
				vobj.setColour(newColour);
				System.out.println("Colour changed!");
				return;
			}
		}

		System.out.println("Vehicle not found with ID: " + id);
	}

	private static void editPrice() {
		System.out.print("Enter vehicle ID to edit price: ");
		int id = sc.nextInt();

		for (vehicle vehicle : arr) {
			if (vehicle.check(id)) {
				System.out.print("Enter new price: ");
				int newPrice = sc.nextInt();
				vehicle.setPrice(newPrice);
				System.out.println("Price updated successfully!");
				return;
			}
		}

		System.out.println("Vehicle not found with ID: " + id);
	}
	
	private static void remove() {
	    System.out.println("Enter vehicle ID to remove: ");
	    int id = sc.nextInt();

	    // Using iterator to avoid ConcurrentModificationException
	    Iterator<vehicle> iterator = arr.iterator();
	    while (iterator.hasNext()) {
	        vehicle vobj = iterator.next();
	        if (vobj.getId() == id) {
	            iterator.remove();  // Remove the current element using iterator
	            System.out.println("Vehicle removed successfully!");
	            return;
	        }
	    }

	    System.out.println("Vehicle not found with ID: " + id);
	}

//    Won't work because loop elements will not be removed as expected
//    private static void remove() {
//    	System.out.println("Enter vehicle ID to remove: ");
//    	int id= sc.nextInt();
//    	for (vehicle vobj : arr) {
//    		if (vobj.getId()== id) {
//    			arr.remove(vobj);
//    			
//    		}
//    	}
//    	
//    }

//	private static void editPrice() {
//		System.out.println("Enter ID:");
//		int id = sc.nextInt();
//		for (vehicle obj : arr) {
//			if (obj.id == id) {
//				System.out.println("Enter the price:");
//				int price = sc.nextInt();
//				vehicle.setPrice(price);
//
//			} else
//				System.out.println("Not found");
//		}
//
//	}

}

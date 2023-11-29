package Tester;

import java.util.Scanner;

import BusinessLogic.point2d;

public class testerpoint2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        point2d[] points = new point2d[5];

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1: Show All Points");
            System.out.println("2: Add New Point");
            System.out.println("0: Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showAllPoints(points);
                    break;
                case 2:
                    addNewPoint(scanner, points);
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

    private static void showAllPoints(point2d[] points) {
        System.out.println("All Points:");
        for (point2d point : points) {
            if (point != null) {
                System.out.println(point.toString());
            }
        }
    }


    private static void addNewPoint(Scanner scanner, point2d[] points) {
        for (int i = 0; i < points.length; i++) {
            if (points[i] == null) {
                System.out.print("Enter x coordinate: ");
                double x = scanner.nextDouble();
                System.out.print("Enter y coordinate: ");
                double y = scanner.nextDouble();

                points[i] = new point2d(x, y);
                System.out.println("Point added successfully.");
                return;
            }
        }
        System.out.println("Array is full. Cannot add more points.");
    }
}

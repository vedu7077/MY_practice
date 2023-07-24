package com.basic;

import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Calculate the area of a shape:");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.println("4. Square");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    double rectangleArea = length * width;
                    System.out.println("The area of the rectangle is: " + rectangleArea);
                    break;
                case 2:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    double circleArea = Math.PI * radius * radius;
                    System.out.println("The area of the circle is: " + circleArea);
                    break;
                case 3:
                    System.out.print("Enter the base length of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = scanner.nextDouble();
                    double triangleArea = 0.5 * base * height;
                    System.out.println("The area of the triangle is: " + triangleArea);
                    break;
                case 4:
                    System.out.print("Enter the side length of the square: ");
                    double side = scanner.nextDouble();
                    double squareArea = side * side;
                    System.out.println("The area of the square is: " + squareArea);
                    break;
                case 0:
                    System.out.println("Exiting... Better Luck Next Time");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            System.out.println();
        } while (choice != 0);
    }
}




// create list of menu which contain menu id name prie menu iteam contain menu id name price 


































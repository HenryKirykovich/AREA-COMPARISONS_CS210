package Assign1;
import java.util.Scanner;

public class Assign1 {

	// Henadzi Kirykovich CS 210
	// 4/28/2025
	// Description: The program for calculating  area of rectangle and area  of triangle and area of a circle. Program ask user put size of figure and then calculating
	
	public static void main(String[] args) {
		Scanner size = new Scanner(System.in);
		
		System.out.println("Define a first shape 1)rectangle, 2)triangle, 3)circle: ");
		int choice1 = size.nextInt();
		double area1 = sizeArea(choice1, size);
		
		System.out.println();
		
		System.out.println("Define a second shape 1)rectangle, 2)triangle, 3)circle: ");
		int choice2 = size.nextInt();
		double area2 = sizeArea(choice2, size);
		
		System.out.println();
		
		System.out.println(area1);
		System.out.println(area2);
		choicen2(choice1,choice2, area1, area2);
		}
		
		
	
	public static double sizeArea (int choice, Scanner size) {
		if (choice == 1) {
			return rectangle(size);
		} else if (choice == 2) {
			return triangle(size);
		} else if (choice == 3)  {
			return circle(size);
		} else {
			return 0;
		}
		
	}
	

	public static double rectangle(Scanner size) {
		System.out.print("Please put size of Rectangle width: ");
		double rectWidht = size.nextDouble();
		System.out.print("Please put size of Rectangle Height: ");
		double rectHeight = size.nextDouble();
		return rectWidht*rectHeight;	
	}

	
	public static double triangle (Scanner size) {
		System.out.print("Please put size of Triangle Base: ");
		double rectBase = size.nextDouble();
		System.out.print("Please put size of Triangle Height: ");
		double rectHeight = size.nextDouble();

		return rectBase*rectHeight/2.0;
	}
	
	
	public static double circle (Scanner size) {
		System.out.print("Please put size a Radius of Circle: ");
		double radius = size.nextDouble();
		return radius*radius*Math.PI;
	}
	
	
	public static void choicen2 (int choice1, int choice2, double area1, double area2) {
		if (choice1 == 1 && choice2 == 2) {
			compaire ("Rectangle", area1, "Triangle", area2);
		} else if (choice1 == 1 && choice2 == 3) {
			compaire ("Rectangle", area1, "Circle", area2);
		} else if (choice1 == 3 && choice2 == 1) {
			compaire ("Circle", area1, "Rectangle", area2);
		}
	}
	
	public static void compaire (String nameFig1, double area1, String nameFig2, double area2) {
		if (area1 > area2) {
			System.out.println();
			System.out.println("The area of the "+nameFig1+ " seems "+(area1/area2)+" times bigger than the area of the "+nameFig2);
		} else if (area1<area2) {
			System.out.println("The area of the "+nameFig1+ " seems "+(area2/area1)+" times less than the area of the "+nameFig2);
		} else {
			System.out.println("The area of the "+nameFig1+ " seems equals the area of the "+nameFig2);
		}
	}
}

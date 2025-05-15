package br.com.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class LogicExpressions9 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// reads two values with two decimal places (x,y)
		// that should represent a coordinates of a point in a flat plane
		// Determine in which quadrant the point it's in
		// if it's in the center, it should print origin
		// Example: Entry - -2.5, 1 = Q2

		System.out.printf("\nSelect the X value: ");
		double x = sc.nextDouble();
		System.out.printf("\nSelect the Y value: ");
		double y = sc.nextDouble();

		if (x == 0 && y == 0) {

			System.out.printf("Origin");

		} else if (x == 0.0) {
			
			System.out.println("Eixo Y");

		} else if (y == 0.0) {  
		
			System.out.println("Eixo X");
		
		} else if (x > 0.0 && y > 0.0) {

			System.out.printf("Q1");

		} else if (x < 0.0 && y > 0) {

			System.out.printf("Q2");

		} else if (x < 0.0 && y < 0.0) {

			System.out.printf("Q3");

		} else {

			System.out.printf("Q4");

		}

		sc.close();

	}

}
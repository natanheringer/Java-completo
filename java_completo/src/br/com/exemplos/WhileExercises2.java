package br.com.exemplos;

import java.util.Scanner;

public class WhileExercises2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// reads x and y coordinates of an undetermined quantity points in the cartesian
		// system
		// for each point -> writes the quadrant in which he's owned
		// the program must be terminated when at least two of the coordinates are null
		// in this case, without writing any message
		// example: x = 2 y = 2 -> first quadrant
		// x = 3 y = -2 -> forth quadrant

		double x = sc.nextDouble();
		double y = sc.nextDouble();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {

				System.out.println("First quadrant");

			} else if (x < 0 && y > 0) {

				System.out.println("Second quadrant");

			} else if (x < 0 && y < 0) {

				System.out.println("Third quadrant");

			} else {

				System.out.println("Fourth quadrant");

			}

			x = sc.nextDouble();
			y = sc.nextDouble();

		}

		sc.close();

	}

}

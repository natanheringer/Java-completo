package grades.application;
import java.util.Locale;
import java.util.Scanner;

import grades.entities.Alumn;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Alumn alumn = new Alumn();

		/*
		 * reads rectangle height and width and show its area, perimeter and diagonal
		 */
		System.out.println("Student's Data");

		System.out.print("\nName: ");
		alumn.name = sc.nextLine();

		System.out.print("\nFirst grade: ");
		alumn.grade1 = sc.nextDouble();

		System.out.print("Second grade: ");
		alumn.grade2 = sc.nextDouble();
		

		System.out.print("Third grade: ");
		alumn.grade3 = sc.nextDouble();
		
		
		System.out.println();
		System.out.println("\nName: " + alumn.name);
		System.out.println();
		System.out.println("Final grade: = " + alumn.finalGrade());
		System.out.printf("", alumn.result());


		sc.close();
	}
}

package workers.salary;

import java.util.Locale;
import java.util.Scanner;

import workers.salary.employee.Employee;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee();

		/*
		 * reads rectangle height and width and show its area, perimeter and diagonal
		 */
		System.out.println("Worker's Data");

		System.out.print("\nName: ");
		emp.name = sc.nextLine();

		System.out.print("\nEarnings: ");
		emp.grossSalary = sc.nextDouble();

		System.out.print("Taxes: ");
		emp.tax = sc.nextDouble();
		
		
		System.out.println();
		System.out.println("\nEmployee: " + emp);
		System.out.println();
		System.out.print("\nWhich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.IncreaseSalary(percentage);

		System.out.println("\nUpdated data: $" + emp);

		sc.close();
	}
}

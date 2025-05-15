package br.com.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class LogicExpressions10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Reads a double value and calculate the tax
		// in accordance to the table below
		// 0.0 to 2000 - no taxes
		// 2000.1 to 3000 - 8% tax
		// 3000.1 to 4500 - 18% tax
		// above 4500 - 28%

		System.out.print("\n\nInforme os seus rendimentos: ");
		double value = sc.nextDouble();
		double tax;

		if (value <= 2000) {
			// Income up to 2000.00 is exempt from tax
			tax = 0;

		} else if (value <= 3000.0) {
			// Income from 2000.01 to 3000.00 is taxed at 8%
			// Calculate tax only on the amount above 2000.00
			tax = (value - 2000.0) * 0.08;

		} else if (value <= 4500.0) {
			// Income from 3000.01 to 4500.00 is taxed at 18%
			// Plus, fixed tax from previous slab (1000 * 8%)
			// Explanation:
			//  - The first 1000 (2000.01 to 3000) taxed at 8%
			//  - The remaining amount (value - 3000) taxed at 18%
			tax = (value - 3000) * 0.18 + 1000 * 0.08;

		} else {
			// Income above 4500.00 is taxed at 28%
			// Plus, fixed taxes from previous slabs:
			//  - 1000 taxed at 8% (2000.01 to 3000)
			//  - 1500 taxed at 18% (3000.01 to 4500)
			// Explanation:
			//  - The first 1000 taxed at 8%
			//  - The next 1500 taxed at 18%
			//  - The remaining amount (value - 4500) taxed at 28%
			tax = (value - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;

		}

		if (tax == 0) {
			System.out.print("Isento");
		} else {
			// Print tax with two decimal places
			System.out.printf("\nValor a pagar: %.2f", tax);
		}

		sc.close();

	}

}
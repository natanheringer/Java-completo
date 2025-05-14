package br.com.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class LogicExpressions1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Reads two incomes from two actors	
		// Tell if they are eligible to receive welfare
		
		
		double JohnIncome, ArthurIncome;
		
		// 
		System.out.print("\nSelect the income of John: ");
		JohnIncome = sc.nextDouble();
		
		System.out.print("\nSelect the income of Arthur: ");
		ArthurIncome = sc.nextDouble();
		
		
		if (JohnIncome <= 3000) {
			
			System.out.print("\n\nJohn is eligible to receive welfare!");
			
		} else if (JohnIncome >= 3000) {
				System.out.print("\n\nJohn is not eligeble to receive welfare!");	
		}
		
		if(ArthurIncome <= 3000) {
			System.out.print("\n\nArthur is eligible to receive welfare!");
		} else if (ArthurIncome >= 3000) {
			System.out.print("\n\nArthur is not eligible to receive welfare!");
		}

		

		sc.close();
	}

}
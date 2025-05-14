package br.com.exemplos;

import java.util.Locale;
//import java.util.Scanner;

public class LogicExpressions4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		// Reads a integer number
		// Tells if the number is even or odd 
		
		int num1 = 12;
		int num2 = -27;
		int num3 = 0;
		
		
		System.out.printf("\n 1 - %d \n 2 - %d \n 3 - %d \n\n", num1, num2, num3);
		
		
		if(num1 % 2 == 0) {
			System.out.print("\n 1 - PAR");
		} else {
			System.out.print("\n 1 - IMPAR");
		}
		
		if(num2 % 2 == 0) {
			System.out.print("\n 2 - PAR");
		} else {
			System.out.print("\n 2 - IMPAR");
		}
		
		
		if(num3 % 2 == 0) {
			System.out.print("\n 3 - PAR");
		} else {
			System.out.print("\n 3 - IMPAR");
		}
		
		
		
	}

}
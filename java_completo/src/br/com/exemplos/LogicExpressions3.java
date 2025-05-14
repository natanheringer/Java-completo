package br.com.exemplos;

import java.util.Locale;
//import java.util.Scanner;

public class LogicExpressions3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		// Reads a integer number
		// Tells if he is negative or not 
		
		int num1 = -10;
		int num2 = 8;
		int num3 = 0;
		
		
		System.out.printf("\n 1 - %d \n 2 - %d \n 3 - %d \n\n", num1, num2, num3);
		
		
		if(num1 < 0) {
			System.out.print("\n 1 - NEGATIVO");
		} else {
			System.out.print("\n 1 - NAO NEGATIVO");
		}
		
		if(num2 < 0) {
			System.out.print("\n 2 - NEGATIVO");
		} else {
			System.out.print("\n 2 - NAO NEGATIVO");
		}
		
		
		if(num3 < 0) {
			System.out.print("\n 3 - NEGATIVO");
		} else {
			System.out.print("\n 3 - NAO NEGATIVO");
		}
		
		
		
	}

}
package br.com.exemplos;

import java.util.Locale;

import java.util.Scanner;

public class ScannerJava {
	
		public static void main (String[] args) {
			
			
			Locale.setDefault(Locale.US);
			
			
			Scanner sc = new Scanner(System.in);
			
			int y; 
			String x;
			
			System.out.printf("Digite um numero: ");
			y = sc.nextInt();
			
			System.out.printf("\nNumero digitado: " + y);
			
			//sc.next() = pause program until data entry
			x = sc.next();
			System.out.println("\nvoce digitou: " + x);
					
					
			sc.close();
			
			
		}
		


}
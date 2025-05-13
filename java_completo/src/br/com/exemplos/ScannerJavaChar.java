package br.com.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ScannerJavaChar {
	
		public static void main (String[] args) {
			
				
			Locale.setDefault(Locale.US);
			
			Scanner scanning = new Scanner(System.in);
			
			//Deactivating the scanner for char 
			//char a;
			//This is how you scan a char variable
			//a = scanning.next().charAt(0);
			
			//Scanning multiple types of variables 
			String x;
			int y;
			double z;
			
			//Calling a type from the user
			System.out.printf("Digite uma palavra, um numero inteiro e um numero decimal: ");
			
			// defining the scan value for the variables
			x = scanning.next();
			y = scanning.nextInt();
			z = scanning.nextDouble();
			
			
			
			
			System.out.println("Dados digitados: ");
	
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			
			
			
			scanning.close();
			
			
			
			
			
			
			
			
			
		}
	
	
	
}
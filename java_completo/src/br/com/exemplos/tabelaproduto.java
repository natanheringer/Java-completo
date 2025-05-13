package br.com.exemplos;

import java.util.Locale;

public class tabelaproduto {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 31;
		int code = 300; 
		double price1 = 2011.25;
		double price2 = 300.55;
		double measure = 53.4342242222;
		char gender = 'F';
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Products: ");
		System.out.printf("%s, wich price is $ %.2f\n", product1, price1);
		System.out.printf("%s, wich price is $ %.2f\n", product2, price2);
		
		System.out.printf("\nRecord: ");
		System.out.printf("%d years old, code %d and gender: %c\n", age, code, gender);
		
		System.out.printf("\nMeasure with eight decimal places: %.8f \n", measure);
		System.out.printf("Rounded to three decimal places: %.3f \n", measure);
		System.out.printf("Us decimal point: %.3f", measure);

	}

}

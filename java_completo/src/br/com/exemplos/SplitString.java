package br.com.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		// Exemplos de usos da função split
		// que divide uma string em vetores
		
		String s = "potato apple lemon orange";
		
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		
		
		sc.close();

	}

}

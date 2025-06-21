package br.com.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class GreaterThan {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		/*
		 * o maior dentre 3 numeros
		 */
		
		int num1, num2, num3;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = sc.nextInt();		
		System.out.println("Digite o terceiro numero: ");
		num3 = sc.nextInt();
		
		int higher = max(num1, num2, num3);
		
		showResult(higher);
		
		sc.close();

	}
	
	
	public static int max(int x, int y, int z) {
		
		
		int aux;
		
		if(x > y && x > z) {
			aux = x;
		} else if(y > z) {
			aux = y;
		} else {
			aux = z;
		}
		
		return aux;
		
	}
	
	public static void showResult (int value) {
		System.out.println("Higher = " + value);
	}
	

}

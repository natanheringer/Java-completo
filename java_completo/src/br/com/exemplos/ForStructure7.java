package br.com.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ForStructure7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		// ler um valor num, calcular e escrever o seu fatorial
		// fatorial de num = N * ( N - 1) * (N - 2) ... * 1
		// enquanto o i for menor ou igual a num realizar operação
		
		
		
		
		
		System.out.print("\nDigite o valor do fatorial: ");
		int num = sc.nextInt();
		int fatorial = 1;
		
		for (int i = 1; i <= num; i++) {
			
			fatorial = fatorial * i;
			
		}
		System.out.println(fatorial);
				
		
		sc.close();
		
		
		}	
		
	}



	



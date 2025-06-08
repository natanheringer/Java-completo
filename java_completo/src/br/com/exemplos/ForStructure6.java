package br.com.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ForStructure6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		// ler par N e dividir o primeiro pelo segundo 
		// se o denominador for igual a 0, mostrar mensagem de erro
		
		
		
		
		
		System.out.print("\nDigite o numero de operacoes de divisoes: ");
		int num = sc.nextInt();
				
		for(int i = 0; i < num; i++) {
			
			double n1 = sc.nextInt();
			double n2 = sc.nextInt();
			
			if(n2 != 0) {
				double divisao = n1 / n2;
				System.out.println("\n\nresultado: " + divisao);
			} else {
				System.out.println("\n\ndivisao impossivel");
			} 
		
			
		}
		
		
		sc.close();
		
		
		}	
		
	}



	



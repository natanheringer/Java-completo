package br.com.exemplos;

import java.util.Scanner;

public class ForStructure {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		System.out.println("\nDigite o numero de iteracoes: ");
		int N = sc.nextInt();
		int soma = 0;
		
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt();
			System.out.println("\nvalor de x: " + x);
			soma = soma + x;
		}
		
		System.out.println("\n\nresultado da soma dos numeros: " + soma);
		
		
		sc.close();
		}



	}



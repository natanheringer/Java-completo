package br.com.exemplos;

import java.util.Scanner;

public class ForStructure3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Ler um valor inteiro de x (1<= X <= 1000)
		// mostrar os impares de 1 até X
		// um valor por linha, inclusive X, se for impar
		
		System.out.print("Digite um valor: ");
		int x = sc.nextInt();
		
		
		for (int i = 1; i <= x; i++) {
			
			if(i % 2 != 0) {
			
				System.out.println(i);
			
			}
		
		}
		
		sc.close();
		
	}
		
		
}



	



package br.com.exemplos;

import java.util.Scanner;

public class ForStructure2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// contagem regressiva 
		int repeticao = sc.nextInt();
		
		for(int i = repeticao; i >= 0; i--) {
			System.out.println("Valor de i: " + i);
		}
		
		
		sc.close();
		}



	}



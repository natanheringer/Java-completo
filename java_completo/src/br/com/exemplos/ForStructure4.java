package br.com.exemplos;

import java.util.Scanner;

public class ForStructure4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// ler um valor inteiro N que será a quiantidade de valores inteiros X que serao lidos em seguida 
		// Mostrar quantos destes valores X estão dentro do intervalo 10,20 e  quantos
		// imprimindo as informaçoes usando in e out 
		
		
		System.out.print("Digite um valor: ");
		int n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for (int i = 0; i < n; i++) {
			
			int x = sc.nextInt();
			
			if(x >= 10 && x <= 20) {
			
				in = in + 1;
			
			} else {
				
					out = out + 1;
			}
		
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		
		sc.close();
		
	}
		
		
}



	



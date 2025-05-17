package br.com.exemplos;
import java.util.Scanner;


public class CondicionalTernaria {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		// Optional structure to if-else when it desires to reach a value
		// based on a condition
		// used mainly to simplify a if-else condition

		double preco = 34.5;
		System.out.printf("Preço original: %.2f%n", preco);

		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

		System.out.println("desconto é de R$ 34.5 - R$ " + desconto);
		
		sc.close();
	}

}
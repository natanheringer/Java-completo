package br.com.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class LogicExercices3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double raio;
		double pi = 3.14159;

		System.out.printf("Digite o valor do raio:");
		raio = sc.nextDouble();

		double area = pi * Math.pow(raio, 2);

		System.out.printf("O resultado da area do raio digitado eh: %.4f%n", area);

		sc.close();
	}

}
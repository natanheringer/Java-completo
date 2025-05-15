package br.com.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class LogicExpressions6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Reads the start time and the end time of a game match
		// Calculate the duration of the match
		// the minimum duration being 1 hour and the maximum being 24 hours

		System.out.print("\n\nDescubra a durucao da partida!\n\n");
		
		System.out.print("Digite a hora inicial: ");
		int inicio = sc.nextInt();
		System.out.print("\nDigite a hora final: ");
		int fim = sc.nextInt();

		int duracao;

		if (inicio < fim) {
			duracao = fim - inicio;
		} else {
			duracao = 24 - inicio + fim;
		}

		System.out.print("\n\nA partida durou " + duracao + " horas!");

		sc.close();

	}

}
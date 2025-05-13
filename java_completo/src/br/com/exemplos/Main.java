package br.com.exemplos;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
//		int declara um numero sem casas decimais
		int x = 69;
//		double declara número com casas decimais
		double y = 99.533;
		double z = 25.5020;
		double d = 500.499909;
		double a = 1.82;
		double r = 454.32232;
		
//		String variavel que declara um sentença (char para um só caracter).
		String name = "João";
		String utilitario = "medíocre";
		
		
		Locale.setDefault(Locale.US);
		
//		println imprime com a quebra de linha.
//		print imprime sem quebra
// 		printf imprime seguindo a formatação de 2 após a vírgula imposta pelo %.2f 
//		(\n ou %n após a formatação quebram a linha)
		System.out.print("Olá amigo! ");
		System.out.println("Vejamos seu mundo! Bem vindo a triagem!");
		System.out.print("seu id: ");
		System.out.println(x);
		System.out.print("seu nome é: ");
		System.out.println(name);
		System.out.print("seu score social é: ");
		System.out.println(y);
		System.out.print("Sua idade é: ");
		System.out.printf("%.2f\n", z);
		System.out.print("Você o total de: ");
		System.out.printf("%.4f", d);
		System.out.print(" R$\n");
		System.out.println("Sua altura é de: " + a + " metros");
		System.out.printf("Sua posição local é: %.2f Rankings%n", r);
		System.out.printf("Resumindo, você é um %s de %.2f anos e tem o id de %d. %n", utilitario, z, x);

	}

}

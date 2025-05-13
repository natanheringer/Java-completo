package br.com.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class LogicExercise7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Reads 3 values of A, B, C
		// Calculates the area of several shapes

		double pi = 3.14159;
		double A, B, C;

		// Entry of the first piece
		System.out.print("Selecione o valor de A:");
		A = sc.nextDouble();
		System.out.print("Selecione o valor de B:");
		B = sc.nextDouble();
		System.out.print("Selecione o valor de C:");
		C = sc.nextDouble();

		double triangleRectangle = A * C / 2;
		double areaCircle = pi * C * C;
		double trapezium = ((A + B) * C) / 2;
		double squareArea = B * B;
		double rectangleArea = A * B;

		System.out.printf("\nTriangulo: %.3f\n", triangleRectangle);
		System.out.printf("Circulo: %.3f\n", areaCircle);
		System.out.printf("Trapezio: %.3f\n", trapezium);
		System.out.printf("Quadrado: %.3f\n", squareArea);
		System.out.printf("Retangulo: %.3f\n", rectangleArea);

		sc.close();
	}

}
package rectanglearea;

import java.util.Locale;
import java.util.Scanner;


import rectanglearea.math.Rectangle;

public class program {
	
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	Rectangle rect = new Rectangle();
	/*
	 * reads  rectangle height and width and show its area, perimeter and diagonal 
	 */
	System.out.println("Análise de retangulo");
	
	System.out.print("\nDigite a largura do retangulo: ");
	rect.a = sc.nextDouble();
	
	System.out.print("\nDigite a altura do retangulo: ");
	rect.b = sc.nextDouble();
	
	
	System.out.printf("Area = %.2f%n", rect.area());
	System.out.printf("Perimeter = %.2f%n", rect.perimeter());
	System.out.printf("Diagonal = %.2f%n", rect.diagonal());
	
	
	
	sc.close();
	}
	
	
}

package br.com.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class LogicExpressions8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// reads any value and shows a message 
				// telling in which of the following ranges 
				// [0,25][25,50][50,75][75,100]
				// the entry value finds himself
				// Example: Entry - 10 = it's in [0,25] 
				
				
				double valor;
				
				
				System.out.print("\n\nDigite o valor: ");
				valor = sc.nextDouble();
				
				
				if (valor < 0 || valor > 100.0){
				    
				    System.out.print("Fora do intervalo");
				    
				} else if (valor <= 25) {
				    
				    System.out.print("Intervalo [0,25]");
				    
				} else if (valor <= 50){
				    
				    System.out.print("Intervalo [25,50]");
				    
				} else if (valor <= 75){
				    
				    System.out.print("Intervalo [50,75]");
				    
				} else {
				    
				    System.out.print("Intervalo [75,100]");
				    
				};
				
				
				sc.close();

	}

}
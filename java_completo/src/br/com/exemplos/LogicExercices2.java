package br.com.exemplos; 
import java.util.Scanner; 


public class LogicExercices2 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		
		
		System.out.print("Digite o primeiro numero: ");
		int num1 = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		int num2 = sc.nextInt();
		
		
		int soma = num1 + num2; 
		
		
		System.out.println("A soma de " + num1 + " + " + num2 + " = " + soma);
		
		
		sc.close();
	}
	
	
}
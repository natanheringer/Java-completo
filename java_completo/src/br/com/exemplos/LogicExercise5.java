package br.com.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class LogicExercise5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Reads the id of an employee, his worked hours,
		// the value he receives per hour 
		// after that calculates his salary based 
		// on value per hour x worked hours 

		int ID;
		double Hworked, MoneyPerH;

		System.out.print("Selecione o ID do funcionario:");
		ID = sc.nextInt();
		System.out.print("Carga horaria do funcionario:");
		Hworked = sc.nextDouble();
		System.out.print("Salario por hora:");
		MoneyPerH = sc.nextDouble();
		

		double SalaryPerHour = Hworked * MoneyPerH; 
		

		System.out.printf("ID = %d\nSalary = U$ %.2f", ID, SalaryPerHour);

		sc.close();
	}

}
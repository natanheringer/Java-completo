package br.com.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class LogicExpressions11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// a R$ 50.0 plan gives you 100 minutes for calling
		// if the the user exceeds the 100 minutes,
		// for every minute exceeded it costs R$ 2 per minute

		int minutos = sc.nextInt();

		// standard value of the plan
		double conta = 50.0;

		// if minutes exceeds 100 minutes >>
		if (minutos > 100) {

			// += means conta = conta + ...
			// \/ finds the exceeded amount minutes - 100 (free plan)
			conta += (minutos - 100) * 2; // times 2 which is the extra cost - R$ 2 per minute

		}

		System.out.printf("Valor da conta = R$ %.2f%n", conta);

		sc.close();

	}

}
package com.senac.planilha;

import java.util.Scanner;

import com.senac.algoritmos.AvaliadorExpressao;
import com.senac.algoritmos.InvalidOperator;
import com.senac.algoritmos.InvalidToken;

public class Planilha {

	/**
	 * @param args
	 * @throws InvalidOperator 
	 * @throws InvalidToken 
	 */
	public static void main(String[] args)
			throws InvalidOperator, InvalidToken
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String formula = sc.nextLine();
			if (formula.equalsIgnoreCase("fim"))
				break;
			String postfix = AvaliadorExpressao.convertInfixToPostfix(formula);
			double result = AvaliadorExpressao.evaluateRPN( postfix );
			System.out.println("Resultado: " + result);
		}
	}

}

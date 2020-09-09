package application;

import java.util.Locale;
import java.util.Scanner;
/*4-	Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
 * Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
 * */

public class Ex_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		double number;
		
		System.out.printf("Enter the number: ");
		number = kb.nextInt();
		
		if(number % 2 == 0 || number % -2 == 0) {
			System.out.printf("\nThe number %.2f is even", number);
			System.out.printf("\nThe square root of that number is %.2f", Math.sqrt(number));
		}
		else {
			System.out.printf("\nThe number %.2f is odd", number);
			System.out.printf("\nThe squared number is %.2f", Math.pow(number, 2));
		}
		kb.close();
	}
}		
package application;

import java.util.Scanner;
/*2) Elabore um sistema que leia as variáveis C e N, respectivamente código
 *  e número de horas trabalhadas de um operário. E calcule o salário sabendo-se 
 *  que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule 
 *  o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. 
 *  A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário
 *   total e o salário excedente.
 */
public class Ex_2 {

	public static void main(String[] args) {
		final double HOUR_VALUE = 10, EXTRAH_VALUE = 20, HOUR_LIMIT = 50;
		double workedHour, excessHour = 0, totalPayment, excessPayment = 0;
		String workerCode;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("\nEnter the worker code: ");
		workerCode = keyboard.next();
		System.out.printf("\nEnter the number of worked hours: ");
		workedHour = keyboard.nextDouble();
		
		if(workedHour > HOUR_LIMIT) {
			excessHour = workedHour - HOUR_LIMIT;
			excessPayment = excessHour * EXTRAH_VALUE;
			totalPayment = (HOUR_VALUE * HOUR_LIMIT) + excessPayment;
			System.out.printf("\nThe normal salary is R$ %.2f", HOUR_VALUE * HOUR_LIMIT);
			System.out.printf("\nThe excess salary is R$ %.2f", excessPayment);
			System.out.printf("\nThe total salary is R$ %.2f", totalPayment);
		}
		else {
			totalPayment = (workedHour * HOUR_VALUE);
			System.out.printf("\nThe excess salary is R$ %.2f", excessPayment);
			System.out.printf("\nThe total salary is R$ %.2f", totalPayment);
		}
	}
}


package application;

import java.util.Scanner;

/*Escrever um programa que receba v�rios n�meros inteiros noteclado. 
E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/


public class Ex_6 {

	public static void main(String[] args) {

		double number, average, sum = 0;
		int i = 0;
		Scanner kb = new Scanner(System.in);
		
		do {
			System.out.printf("Enter the number: ");
			number = kb.nextInt();
			if (number != 0 && number % 3 == 0 || number != 0 && number % -3 == 0) {
			sum = sum + number;
			i++;
			}
		} 
		while (number != 0);
		average = sum / i;
		System.out.printf("\nThe average of all numbers entered is: %.2f", average);
		kb.close();
	}
}
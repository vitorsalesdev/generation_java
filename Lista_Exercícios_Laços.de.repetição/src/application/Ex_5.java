package application;

import java.util.Scanner;

/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
 *  No final, mostre a soma dos n�meros digitados.(DO...WHILE)
 */


public class Ex_5 {

	public static void main(String[] args) {

		int number, sum = 0;
		Scanner kb = new Scanner(System.in);
		
		do {
			System.out.printf("Enter the number: ");
			number = kb.nextInt();
			sum = sum + number;
		} 
		while (number != 0);
		System.out.printf("\nThe sum of all numbers entered is: %d", sum);
		kb.close();
	}
}

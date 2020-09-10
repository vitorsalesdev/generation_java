package application;

import java.util.Scanner;

/*Crie um programa que leia um número do teclado até que encontre um número igual a zero.
 *  No final, mostre a soma dos números digitados.(DO...WHILE)
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

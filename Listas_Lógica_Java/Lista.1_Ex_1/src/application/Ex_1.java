package application;

import java.util.Scanner;
/*1. Faça um sistema que leia a idade de 
 * uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 
 */

public class Ex_1 {

	public static void main(String[] args) {
		int total, year, month, day;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Enter how many years you lived: ");
		year = keyboard.nextInt();
		System.out.printf("\nEnter how many months you lived: ");
		month = keyboard.nextInt();
		System.out.printf("\nEnter how many days you lived: ");
		day = keyboard.nextInt();
		
		total = ((year * 365) + (month * 30) + (day * 1));
		
		System.out.printf("You lived %d days", total);
	}
}
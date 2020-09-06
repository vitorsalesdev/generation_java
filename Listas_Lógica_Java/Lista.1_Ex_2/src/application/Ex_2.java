package application;

import java.util.Scanner;

/*2. Faça um sistema que leia a idade de uma pessoa expressa 
 * em dias e mostre-a expressa em anos, meses e dias.
 */

public class Ex_2 {
	public static void main(String[] args) {
		int total, year, month, day;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Enter how many days you lived: ");
		
		total = keyboard.nextInt();
		year = (total / 360);
		month = (total % 360) / 30;
		day = (total % 360) % 30;
		
		System.out.printf(" \nYou lived %d year(s), %d month(s) and %d day(s)", year, month, day);
	}
}

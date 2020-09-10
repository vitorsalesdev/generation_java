package application;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
 *  Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
 */
public class Ex_3 {
	public static void main(String[] args) {
		
		final int AGE_LIMIT = 99, UNDER_LIMIT = 21, OVER_LIMIT = 50;
		int age = 0, under = 0, over = 0;
		Scanner kb = new Scanner(System.in);
		
		while (age <= AGE_LIMIT){
			System.out.printf("Enter the person's age: ");
			age = kb.nextInt();
			if(age < UNDER_LIMIT) {
				under++;
			}
			else if(age > OVER_LIMIT) {
				over++;
			}
		}
		System.out.printf("\nIn total %d people are under 21 years old and %d people are over 50 years old..", under, over);
	}
}

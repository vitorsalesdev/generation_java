package application;

import java.util.Scanner;

/*4) Fa�a um sistema que leia um n�mero inteiro e 
 * mostre uma mensagem indicando se este n�mero � par ou �mpar, e se � positivo ou negativo.
 * */

public class Ex_4 {

	public static void main(String[] args) {
		int number;
		Scanner keyboard = new Scanner(System.in);

		System.out.printf("Enter the number: ");
		number = keyboard.nextInt();
		
		if(number >= 0) {
			System.out.printf("\nThe number %d is positive", number);
			if(number % 2 == 0) {
				System.out.printf("\nThe number %d is even", number);
			}
			else {
				System.out.printf("\nThe number %d is odd", number);
			}
		}
		else {
			System.out.printf("\nThe number %d is negative", number);
			if(number % -2 == 0) {
				System.out.printf("\nThe number %d is even", number);
			}
			else {
				System.out.printf("\nThe number %d is odd", number);
			}		
		}
	}
}																			
package application;

import java.util.Scanner;
/*3) Desenvolva um sistema em que:
•Leia 4 (quatro) números;
•Calcule o quadrado de cada um;
•Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
•Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/
public class Ex_3 {
	public static void main(String[] args) {
		double num1, num2, num3, num4;
		final double POWER = 2;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		num1 = keyboard.nextDouble();
		System.out.println("Enter the second number: ");
		num2 = keyboard.nextDouble();
		System.out.println("Enter the third number: ");
		num3 = keyboard.nextDouble();
		System.out.println("Enter the fourth number: ");
		num4 = keyboard.nextDouble();
		
		if(Math.pow(num3, POWER) >= 1000) {
			System.out.printf("\nThe square of third number is %.0f", Math.pow(num3, POWER));
		}
		else {
			System.out.printf("\nThe first number entered was %.0f. The square of that number is %.0f", num1, Math.pow(num1, POWER));
			System.out.printf("\nThe second number entered was %.0f. The square of that number is %.0f", num2, Math.pow(num2, POWER));
			System.out.printf("\nThe first number entered was %.0f. The square of that number is %.0f", num3, Math.pow(num3, POWER));
			System.out.printf("\nThe first number entered was %.0f.The square of that number is %.0f", num4, Math.pow(num4, POWER));
		}
	}
}

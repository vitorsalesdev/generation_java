package application;

import java.util.Scanner;

/*4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
	 , onde   D = R + S / 2. Onde R = (A + B)² e S = (B + C)².
	 */


public class Ex_4 {
	
	public static void main(String[] args) {
		
		int a, b, c;
		double d, s, r;
		
		Scanner keyboard = new Scanner(System.in);

		System.out.printf("Enter the first positive integer: ");
		a = keyboard.nextInt();
		while (a < 0) {
			System.out.println("The number must be a positive integer. Enter the first number: ");
			a = keyboard.nextInt();
		}
		System.out.printf("Enter the second positive integer: ");
		b = keyboard.nextInt();
		while (b < 0) {
			System.out.printf("The number must be a positive integer. Enter the second number: ");
			b = keyboard.nextInt();
		}
		System.out.printf("Enter the third positive integer: ");
		c = keyboard.nextInt();
		while (c < 0) {
			System.out.printf("The number must be a positive integer. Enter the third number: ");
			c = keyboard.nextInt();
		}
		
		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);
		d = ((r + s) / 2);
		
		System.out.printf("The result is: %.2f", d );
	}
}

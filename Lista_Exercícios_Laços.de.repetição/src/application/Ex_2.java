package application;

import java.util.Scanner;

/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

public class Ex_2 {

	public static void main(String[] args) {

		final int N_VALUE = 10;
		int number, even = 0, odd = 0, i;
		Scanner kb = new Scanner(System.in);
		
		for(i = 0; i < N_VALUE; i++) {
			System.out.printf("Enter the %d° number: ", (i + 1));
			number = kb.nextInt();
			if(number % 2 == 0 || number % -2 ==0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.printf("\nIn total %d number(s) are even and %d number(s) are odd", even, odd);
	}
}

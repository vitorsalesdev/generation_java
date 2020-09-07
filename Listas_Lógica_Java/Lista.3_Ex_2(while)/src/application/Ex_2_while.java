package application;

import java.util.Scanner;

/*2- Obtenha um número digitado pelo usuário e repita a 
 * operação de multiplicar ele por três  (imprimindo o novo valor) até que ele seja maior 
 * do que 100. Ex.: se o usuário digita 5,  deveremos observar na tela a seguinte sequência: 5 15 45 135.
 */

public class Ex_2_while {

	public static void main(String[] args) {
		int number = 0;
		Scanner kb = new Scanner(System.in);
		
		while(number <= 0) {
			System.out.printf("Enter an integer greater than 0: ");
			number = kb.nextInt();
		}
		while(number > 0 && number <= 100) {
			System.out.printf("%d ", number);
			number = number * 3;
		}
		System.out.printf("%d", number);
	}
}

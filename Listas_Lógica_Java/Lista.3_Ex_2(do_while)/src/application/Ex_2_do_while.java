package application;

import java.util.Scanner;

/*2- Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos os n�meros  de 1 at� ele.
 *  Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
 */

public class Ex_2_do_while {
	public static void main(String[] args) {
		int number, sum = 0, i = 0;
		Scanner kb = new Scanner(System.in);
		
		System.out.printf("Enter the number: ");
		number = kb.nextInt();
		
		do {
			sum = sum + i;
			i++;
		}
		while(i <= number);
		{
			System.out.println(sum);
		}
	}
}
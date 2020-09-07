package application;

import java.util.Scanner;
/*8) Construa um sistema para ler uma variável numérica N 
 * e imprimi-la somente se a mesma for maior que 100, caso contrário imprimi-la com o valor zero.
 */
public class Ex_8 {

	public static void main(String[] args) {
		float N;
		Scanner keyboard= new Scanner(System.in);

		System.out.println("Enter the number: ");
		N = keyboard.nextFloat();
		
		if(N < 100) {
			N = 0;
			System.out.printf("%.0f", N);
		}
		else {
			System.out.printf("%.0f", N);
		}
	}
}
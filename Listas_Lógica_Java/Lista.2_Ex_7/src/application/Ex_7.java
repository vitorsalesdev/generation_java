package application;

import java.util.Scanner;
/*7) Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos
 *  (positivos maiores que zero). 
 * Em caso afirmativo, calcular a �rea do tri�ngulo.
 */
public class Ex_7 {

	public static void main(String[] args) {
		float base, height, area;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Enter the base value: ");
		base = keyboard.nextFloat();
		System.out.printf("Enter the height value: ");
		height = keyboard.nextFloat();
		
		if(base > 0 && height >0) {
			area = (base * height /2);
			System.out.printf("\nthe triangle area is %.2f", area);
		}
		else {
			System.out.printf("\nBase and height must be greater than zero");
		}
	}
}

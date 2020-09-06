package application;

import java.util.Scanner;

/*6. Construa um programa em c que, tendo como dados de entrada dois pontos 
 * quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. 
 */

public class Ex_6 {

	public static void main(String[] args) {
		double distance, x1, y1, x2, y2;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Enter x1: ");
		x1 = keyboard.nextDouble();
		System.out.printf("Enter y1: ");
		y1 = keyboard.nextDouble();
		System.out.printf("Enter x2: ");
		x2 = keyboard.nextDouble();
		System.out.printf("Enter y2: ");
		y2 = keyboard.nextDouble();
		
		distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.printf("The distance between the two points is %.2f", distance);
	}
}

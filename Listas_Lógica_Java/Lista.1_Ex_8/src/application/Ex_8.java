package application;

import java.util.Scanner;
/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do
 *  distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor
 *  seja de 28% e os impostos de 45%,
 *  escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
 */
public class Ex_8 {

	public static void main(String[] args) {
		final double DISTRIBUTOR_FEE = 0.28;
		final double TAX = 0.45;
		double costFactory, costConsumer;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the factory cost of the car: ");
		costFactory = keyboard.nextFloat();
		
		costConsumer = (costFactory + (costFactory * DISTRIBUTOR_FEE) + (costFactory * TAX));
		
		System.out.printf("The cost of the car to the consumer is R$ %.2f", costConsumer);
	}
}

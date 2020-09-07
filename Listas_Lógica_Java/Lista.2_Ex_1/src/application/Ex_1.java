package application;

import java.util.Scanner;
/*1) João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento 
 * diário de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento 
 * do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você 
 * faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso. 
 * Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar.
 *  Caso contrário mostrar tais variáveis com o conteúdo ZERO.
 */
public class Ex_1 {

	public static void main(String[] args) {
		final double ASSESMENT_VALUE = 4, LIMIT_WEIGHT = 50;
		double tomatoWeight, excess = 0, finalAssesment = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Enter the tomato weight: ");
		tomatoWeight = keyboard.nextDouble();

		if(tomatoWeight >= 0 && tomatoWeight <= LIMIT_WEIGHT) {
			System.out.printf("\nThere was no excess weight");
			System.out.printf("\nExcess = %f kg", excess);
			System.out.printf("\nFinal assesment = R$ %f", finalAssesment);
		}
		else {
			excess = tomatoWeight - LIMIT_WEIGHT;
			finalAssesment = excess * ASSESMENT_VALUE;
			System.out.printf("\nThere was overweight");
			System.out.printf("\nExcess = %.2f kg", excess);
			System.out.printf("\nFinal assesment = R$ %.2f", finalAssesment);
		}
	}
}

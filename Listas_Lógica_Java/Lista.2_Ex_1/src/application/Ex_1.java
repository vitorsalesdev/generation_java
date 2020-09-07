package application;

import java.util.Scanner;
/*1) Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento 
 * di�rio de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento 
 * do estado de S�o Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� 
 * fa�a um sistema que leia a vari�vel P (peso de tomates) e verifique se h� excesso. 
 * Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor da multa que Jo�o dever� pagar.
 *  Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.
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

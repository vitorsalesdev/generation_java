package application;

import java.util.Scanner;
/*
 * 7. Um sistema de equações lineares do tipo: ax + by = c
 * 											   dx + ey = f		
  
 pode ser resolvido segundo mostrado abaixx: 
 x = ce -bf				y = af - cd
  	__________			   _________	
  	ae - bd					ae - bd
  	
  	Escreva um sistema que lê os coeficientes 
  	a,b,c,d,e e f e calcula e mostra os valores de x e y. 
 */

public class Ex_7 {

	public static void main(String[] args) {
		double a, b, c , d, e, f, x, y;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Enter the coefficient A: ");
		a = keyboard.nextDouble();
		System.out.printf("Enter the coefficient B: ");
		b = keyboard.nextDouble();
		System.out.printf("Enter the coefficient C: ");
		c = keyboard.nextDouble();
		System.out.printf("Enter the coefficient D: ");
		d = keyboard.nextDouble();
		System.out.printf("Enter the coefficient E: ");
		e = keyboard.nextDouble();
		System.out.printf("Enter the coefficient F: ");
		f = keyboard.nextDouble();
		
		x = (c * e - b * f) / (a * e - b * d);
		y = (a * f - c * d) / (a * e - b * f);
		
		System.out.printf("The value of X is %f", x);
		System.out.printf("\nThe value of Y is %f", y);
		
	}

}

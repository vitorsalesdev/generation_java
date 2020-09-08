package application;

import java.util.Random;
import java.util.Scanner;

/*1.     Leia um vetor de 20 posições e em seguida um valor X qualquer. Seu programa devera fazer 
 * uma busca do valor de X no vetor lido e informar a posição em que foi encontrado ou se não foi encontrado.	
 * 
 */

public class Ex_1 {

	public static void main(String[] args) {
		final int POSITIONS = 20, LIMIT = 21;
		int value[] = new int[POSITIONS];
		int i, x;
		boolean search = false;
		Random rd = new Random();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("The vector is: ");
		for(i = 0; i < POSITIONS; i++) {
			value[i] = rd.nextInt(LIMIT);
			System.out.printf("[%d]", value[i]);
		}
		System.out.printf("\nEnter the value you want to search: ");
		x = kb.nextInt();
		for(i =0; i < POSITIONS; i++) {
			if(value[i] == x)
			{
				System.out.printf("\nThe value %d was found in the position [%d]", x, i);
				search = true;
			}
		}
		if(search == false)
		{
			System.out.printf("\nThe value %d was not found in any position", x);
		}
	}
}
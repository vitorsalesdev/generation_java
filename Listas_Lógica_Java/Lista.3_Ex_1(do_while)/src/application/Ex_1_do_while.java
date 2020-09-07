package application;

public class Ex_1_do_while {
	/*1- Faça um programa que mostre uma contagem na tela de 233 a 456,
	 *  só que contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
	 * */

	public static void main(String[] args) {
		int number = 233;
		
		do {
			System.out.println(number);
			if(number >= 300 && number <= 400)
			{
				number = number + 3;
			}
			else {
				number = number + 5;
			}
		}
		while(number <= 456);
		{
			System.out.println("456");
		}
	}
}

package application;

import java.util.Scanner;

/*5) A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de ind�strias que 
s�o altamente poluentes do meio ambiente. O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25. Se o �ndice 
sobe para 0,3 as ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades, se o �ndice crescer para
0,4 as industrias do 1� e 2� grupo s�o intimadas a suspenderem suas atividades, se o �ndice atingir 0,5 todos 
os grupos devem ser notificados a paralisarem suas atividades. Fa�a um sistema que leia o �ndice de polui��o 
medido e emita a notifica��o adequada aos diferentes grupos de empresas.
*/
public class Ex_5 {

	public static void main(String[] args) {
		float pollutionIndex;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("\nEnter the pollution index: ");
		pollutionIndex = keyboard.nextFloat();
		
		if(pollutionIndex >= 0 && pollutionIndex < 0.3) {
			System.out.printf("\nAll industries can continue to function normally");
		}
		else if(pollutionIndex >= 0.3 && pollutionIndex < 0.4) {
			System.out.printf("\nGroup 1 industries must suspend activities immediately");
		}
		else if(pollutionIndex >= 0.4 && pollutionIndex < 0.5) {
			System.out.printf("\nGroup 1 and 2 industries must suspend activities immediately");
		}
		else {
			System.out.printf("\nIndustries of all groups must suspend activities immediately");
		}
	}
}
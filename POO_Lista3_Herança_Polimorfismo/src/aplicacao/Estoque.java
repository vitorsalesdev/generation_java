package aplicacao;

import java.util.ArrayList;

public class Estoque {
	public static void main(String[] args) {
		
		ArrayList<String> estoque = new ArrayList();
		ArrayList<String> estoque2 = new ArrayList();
		
		//Adiciona
		estoque.add("Arroz");
		estoque.add("Feijão");
		estoque.add("Carne");
		estoque.add("Batata");
		
		estoque2.add("Coca");
		estoque2.add("Leite");
		
		//Remove
		estoque.remove("Batata");
		
		//Atualizar estoque 1 adicionando itens do estoque 2 
		estoque.addAll(estoque2);
		
		//Apresenta
		if(estoque.isEmpty()) {
			System.out.println("Estoque vazio");
		}
		else {
			System.out.println("Itens no estoque principal:");
			for(String listar : estoque) {
				System.out.println(listar);
			}
		}	
	}
}
package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entidades.Animal;
import entidades.Cachorro;
import entidades.Cavalo;
import entidades.Preguica;

public class TesteAnimal {
	public static void main(String[] args) {
		
		List<Animal> list = new ArrayList();
		
		list.add(new Cachorro ("Shiro", "7"));
		list.add(new Cavalo ("Spirit", "20"));
		list.add(new Preguica("Flash", "5"));
		for(Animal animal : list) {
			System.out.println(animal.getNome());
			System.out.println(animal.getIdade());
			animal.emitirSom();
			animal.acao();
			System.out.println();
		}
	}
}

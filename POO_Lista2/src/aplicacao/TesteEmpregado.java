package aplicacao;

import entidades.Empregado;

public class TesteEmpregado {
	public static void main(String[] args) {
		
		Empregado empregadoTeste = new Empregado("Vitor","Avenida Paulista 000", "4002-8922", 524, 4500, 13.5);
		
		System.out.println(empregadoTeste.getNome());
		System.out.println(empregadoTeste.getEndereço());
		System.out.println(empregadoTeste.getTelefone());
		System.out.println(empregadoTeste.getCodigoSetor());
		System.out.println(empregadoTeste.calcularSalario());
		empregadoTeste.setNome("João");
		empregadoTeste.setEndereço("Santo Amaro 000");
		empregadoTeste.setTelefone("4000-0000");
		empregadoTeste.setCodigoSetor(111);
		empregadoTeste.setSalarioBase(10000);
		empregadoTeste.setImposto(20);
		System.out.println();
		System.out.println(empregadoTeste.getNome());
		System.out.println(empregadoTeste.getEndereço());
		System.out.println(empregadoTeste.getTelefone());
		System.out.println(empregadoTeste.getCodigoSetor());
		System.out.println(empregadoTeste.calcularSalario());
	}	
}
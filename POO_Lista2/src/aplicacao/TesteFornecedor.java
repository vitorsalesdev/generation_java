package aplicacao;

import entidades.Fornecedor;

public class TesteFornecedor {

	public static void main(String[] args) {
		
		Fornecedor fornecedorTeste = new Fornecedor("Vitor","Avenida Paulista 000", "4002-8922", 2500.00, 4000.00);
		
		System.out.println(fornecedorTeste.getNome());
		System.out.println(fornecedorTeste.getEndereço());
		System.out.println(fornecedorTeste.getTelefone());
		System.out.println(fornecedorTeste.obterSaldo());
		fornecedorTeste.setNome("João");
		fornecedorTeste.setEndereço("Santo Amaro 000");
		fornecedorTeste.setTelefone("4000-0000");
		fornecedorTeste.setValorCredito(6000);
		fornecedorTeste.setValorDivida(1000);
		System.out.println();
		System.out.println(fornecedorTeste.getNome());
		System.out.println(fornecedorTeste.getEndereço());
		System.out.println(fornecedorTeste.getTelefone());
		System.out.println(fornecedorTeste.obterSaldo());
	}
}

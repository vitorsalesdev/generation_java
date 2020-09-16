package aplicacao;

import java.util.Scanner;
import entidades.Funcionario;

public class Principal {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		Funcionario novoFuncionario = new Funcionario();
		
		System.out.printf("Digite o nome do funcion�rio: ");
		novoFuncionario.nomeFuncionario = kb.nextLine().toUpperCase();
		System.out.printf("Digite a idade do funcion�rio: ");
		novoFuncionario.idadeFuncionario = kb.nextInt();
		System.out.printf("Informe o sexo do funcion�rio. Digite (M) para masculino e (F) para feminino: ");
		novoFuncionario.sexoFuncionario = kb.next().toUpperCase().charAt(0);
		System.out.printf("Digite a matr�cula do funcion�rio: ");
		novoFuncionario.matriculaFuncionario = kb.nextLong();
		System.out.printf("Digite o cargo do funcion�rio: ");
		novoFuncionario.cargoFuncionario = kb.next();
		System.out.printf("Digite o sal�rio do funcion�rio: ");
		novoFuncionario.salarioFuncionario = kb.nextDouble();
		
		novoFuncionario.mostrarDados();
	}

}

package aplicacao;

import java.util.Scanner;
import entidades.Funcionario;

public class Principal {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		Funcionario novoFuncionario = new Funcionario();
		
		System.out.printf("Digite o nome do funcionário: ");
		novoFuncionario.nomeFuncionario = kb.nextLine().toUpperCase();
		System.out.printf("Digite a idade do funcionário: ");
		novoFuncionario.idadeFuncionario = kb.nextInt();
		System.out.printf("Informe o sexo do funcionário. Digite (M) para masculino e (F) para feminino: ");
		novoFuncionario.sexoFuncionario = kb.next().toUpperCase().charAt(0);
		System.out.printf("Digite a matrícula do funcionário: ");
		novoFuncionario.matriculaFuncionario = kb.nextLong();
		System.out.printf("Digite o cargo do funcionário: ");
		novoFuncionario.cargoFuncionario = kb.next();
		System.out.printf("Digite o salário do funcionário: ");
		novoFuncionario.salarioFuncionario = kb.nextDouble();
		
		novoFuncionario.mostrarDados();
	}

}

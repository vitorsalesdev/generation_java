package entidades;

public class Funcionario {
	public String nomeFuncionario;
	public int idadeFuncionario;
	public long matriculaFuncionario;
	public char sexoFuncionario;
	public String cargoFuncionario;
	public double salarioFuncionario;

	public void mostrarDados() {
		System.out.printf("\nNome: %s", nomeFuncionario);
		System.out.printf("\nIdade: %d", idadeFuncionario);
		if(sexoFuncionario == 'M') {
			System.out.println("\nSexo: Masculino");
		}
		else if(sexoFuncionario == 'F') {
			System.out.println("\nSexo: Feminino");
		}
		System.out.printf("\nMatrícula: %d", matriculaFuncionario);
		System.out.printf("\nCargo: %s", cargoFuncionario);
		System.out.printf("\nSalário: %.2f", salarioFuncionario);
	}
}
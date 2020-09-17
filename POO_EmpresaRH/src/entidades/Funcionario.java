package entidades;

public class Funcionario {
	private String nome;
	private int horasTrabalhadas;
	private double valorPorHora;
	
	public Funcionario(String nomeFuncionario) {
		super();
		this.nome = nomeFuncionario;
	}
	public Funcionario(String nome, int horasTrabalhadas) {
		super();
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public Funcionario(String nome, int horasTrabalhadas, double valorPorHora) {
		super();
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
	}
	public double pagamento() {
		return this.horasTrabalhadas * this.valorPorHora;
	}
	public double pagamento (int horasTrabalhadas, double valorPorHora) {
		double pagamento;
		pagamento = horasTrabalhadas * valorPorHora;
		setHorasTrabalhadas(horasTrabalhadas);
		setValorPorHora(valorPorHora);
		return pagamento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public double getValorPorHora() {
		return valorPorHora;
	}
	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
}
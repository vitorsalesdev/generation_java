package entidades;

public class Terceiro extends Funcionario{
	
	private double horasAdicionais;

	public Terceiro(String nome) {
		super(nome);
	}
	public Terceiro(String nome, int horasTrabalhadas) {
		super(nome, horasTrabalhadas);
	}
	public Terceiro(String nome, int horasTrabalhadas, double valorPorHora) {
		super(nome, horasTrabalhadas, valorPorHora);
	}
	public Terceiro(String nome, int horasTrabalhadas, double valorPorHora, double horasAdicionais) {
		super(nome, horasTrabalhadas, valorPorHora);
		this.horasAdicionais = horasAdicionais;
	}
	public double getHorasAdicionais() {
		return horasAdicionais;
	}
	public void setHorasAdicionais(double horasAdicionais) {
		this.horasAdicionais = horasAdicionais;
	}
	@Override
	public double pagamento() {
		return super.pagamento() + this.horasAdicionais * super.getValorPorHora();
	}
	public double pagamento(int horasTrabalhadas, double valorPorHora)
	{
		double pagamento;
		pagamento = (horasTrabalhadas * valorPorHora) + (this.getHorasAdicionais()*valorPorHora);
		
		super.setValorPorHora(valorPorHora);
		super.setHorasTrabalhadas(horasTrabalhadas);
		
		return pagamento;
	}
}
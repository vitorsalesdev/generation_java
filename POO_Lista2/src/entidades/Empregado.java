/*3. Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada inst�ncia da classe 
 * Empregado tem, para al�m dos atributos que caracterizam a classe Pessoa, os atributos codigoSetor (inteiro),
 *  salarioBase (vencimento base) e imposto (porcentagem retida dos impostos). Implemente a classe Empregado com m�todos
 *   seletores e modificadores e um m�todo calcularSalario. Escreva um programa de teste adequado para a classe Empregado. 
 */

package entidades;

public class Empregado extends Pessoa{
	public int codigoSetor;
	public double salarioBase;
	public double imposto;
	
	public Empregado(){
		
	}
	public Empregado(String nome, String endere�o, String telefone, int codigoSetor, double salarioBase,
			double imposto) {
		super(nome, endere�o, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	public double calcularSalario() {
		return this.salarioBase - (this.salarioBase * this.imposto / 100);
	}
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
}

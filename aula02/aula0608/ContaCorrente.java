package aula0608;

public class ContaCorrente extends ContaBancaria{
	
	private double limite;

	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public void sacar(double valor) {
		if(valor <= (this.saldo + this.limite)) {
			this.saldo -= valor;
		} else {
			System.err.println("Valor não autorizado!");
		}
	}
}

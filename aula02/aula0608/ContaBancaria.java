package aula0608;

public class ContaBancaria {
	
	private int numero;
	private String titular;
	protected double saldo;
	
	//Getters e setters:
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Outros métodos:
	public void depositar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
		} else {
			System.err.println("Valor não autorizado!");
		}
	}
	public void sacar(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			System.err.println("Valor não autorizado!");
		}
	}
}

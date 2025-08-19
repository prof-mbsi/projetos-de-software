package aula1308interfaces;

public class Retangulo implements Forma, Imprimivel{
	
	private double base;
	private double altura;

	//Getters e setters:
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	//Métodos da interface:
	@Override
	public double calcularArea() {
		return this.base * this.altura;
	}

	@Override
	public double calcularPerimetro() {
		return (2 * this.base) + (2 * this.altura);
	}
	@Override
	public void imprimir() {
		System.out.println("Base: " + this.base + 
				", altura: " + this.altura);		
	}
}

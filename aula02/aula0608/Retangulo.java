package aula0608;

public class Retangulo extends FiguraGeometrica{
	
	double base;
	double altura;

	@Override
	public double calcularArea() {
		return base * altura;
	}

}

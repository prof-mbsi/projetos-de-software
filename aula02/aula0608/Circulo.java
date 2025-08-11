package aula0608;

public class Circulo extends FiguraGeometrica{
	
	double raio;

	@Override
	public double calcularArea() {
		return 3.1415 * raio * raio;
	}

}

package aula1308interfaces;

public class Multiplicacao implements OperacaoMatematica{

	@Override
	public void executar(double a, double b) {
		System.out.println("Multiplicação: " + (a * b));
	}

	@Override
	public void descricao() {
		System.out.println("Chamou Multiplicacao!");
	}

}

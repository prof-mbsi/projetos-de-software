package aula1308interfaces;

public class Subtracao implements OperacaoMatematica{

	@Override
	public void executar(double a, double b) {
		System.out.println("Subtração: " + (a - b));
	}

	@Override
	public void descricao() {
		System.out.println("Chamou Subtracao!");
	}

}

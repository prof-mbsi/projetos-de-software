package aula1308interfaces;

public class Soma implements OperacaoMatematica{

	@Override
	public void executar(double a, double b) {
		System.out.println("Soma: " + (a + b));
	}

	@Override
	public void descricao() {
		System.out.println("Chamou Soma!");
	}

}

package aula1308interfaces;

public class Divisao implements OperacaoMatematica{

	@Override
	public void executar(double a, double b) {
		System.out.println("Divisão: " + (a / b));
	}

	@Override
	public void descricao() {
		System.out.println("Chamou Divisao!");
	}

}

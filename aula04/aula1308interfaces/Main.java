package aula1308interfaces;

public class Main {

	public static void main(String[] args) {
		
		Relatorio r = new Relatorio();
		r.imprimir();
		
		Retangulo re = new Retangulo();
		re.setBase(12.5);
		re.setAltura(3);
		System.out.println("Área de re: " + 
				re.calcularArea());
		System.out.println("Perímetro de re: " + 
					re.calcularPerimetro());
		re.imprimir();
		
		Soma soma = new Soma();
		Subtracao sub = new Subtracao();
		Multiplicacao mult = new Multiplicacao();
		Divisao div = new Divisao();
		
		soma.executar(8, 6);
		sub.executar(8, 6);
		mult.executar(8, 6);
		div.executar(8, 0);
		
		soma.descricao();
		sub.descricao();
		mult.descricao();
		div.descricao();
	}

}

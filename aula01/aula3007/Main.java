package aula3007;

public class Main {

	public static void main(String[] args) {
		
		Autor a1 = new Autor();
		a1.setNome("Pedro");
		a1.setNacionalidade("Português");
		a1.exibirDados();
		
		Livro l1 = new Livro();
		l1.setTitulo("Primeiro livro");
		l1.setAno(2010);
		l1.setAutor(a1);
		l1.exibirDados();
		
		Livro l2 = new Livro();
		l2.setTitulo("Segundo livro");
		l2.setAno(2015);
		l2.setAutor(a1);
		l2.exibirDados();
		
		Livro[] l = new Livro[2];
		l[0] = l1;
		l[1] = l2;
		
		System.out.println("Dados do livro no array: ");
		l[1].exibirDados();
		
		Acervo ac = new Acervo();
		ac.setLivros(l);
		
		System.out.println("Dados do livro no acervo: ");
		ac.getLivros()[1].exibirDados();
		
		ac.exibirLivros();

	}

}

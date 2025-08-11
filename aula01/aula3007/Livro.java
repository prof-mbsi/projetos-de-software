package aula3007;

public class Livro {
	
	private String titulo;
	private int ano;
	private Autor autor;
	
	//Getters e setters:
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	//Outros métodos:
	public void exibirDados() {
		System.out.println("Título: " + titulo
				+ ", ano: " + ano
				+ ", autor: " + autor.getNome());
	}
}

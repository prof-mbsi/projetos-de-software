package aula3007;

public class Autor {
	
	private String nome;
	private String nacionalidade;
	
	//Getters e setters:
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	//Outros métodos:
	public void exibirDados() {
		System.out.println("Autor: " + nome 
				+ ", nacionalidade: " + nacionalidade);
	}

}

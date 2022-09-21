package entities;

public class Pessoa {
	private String nome;
	private int idade;	
	
	public Pessoa(String nome, int idade) {		
		this.nome = nome;
		this.idade = idade;		
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}		
	
}

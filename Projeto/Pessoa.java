package Projeto;

public class Pessoa {
	//atributos
	private String nome;
	private String sexo;
	private int telefone;
	private int idade;
	//construtores
	public Pessoa() {
	}
	public Pessoa(String nome, String sexo, int telefone, int idade) {
		this.idade = idade;
		this.nome = nome;
		this.sexo = sexo;
		this.telefone = telefone;
	}
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo=sexo;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone=telefone;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade=idade;
	}
}

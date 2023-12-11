package Projeto;

public class Cliente extends Pessoa{
	//atributos
	private String localização;
	//construtores
	public Cliente() {
	}
	public Cliente(String nome, char sexo, int telefone, int idade, String localização) {
		this.localização = localização;
	}
	//getters e setters
	public String getLocalização() {
		return localização;
	}
	public void setLocalização(String localização) {
		this.localização=localização;
	}
	//métodos
	public void fazerPedido() {
		System.out.println("Escolha o que deseja comer:");
	}
	
	
}

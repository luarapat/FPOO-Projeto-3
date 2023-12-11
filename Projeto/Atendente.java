package Projeto;

public class Atendente extends Funcionário {
	//atributos
	//construtor
	public Atendente() {
	}
	public Atendente(int registro, String turno) {
		super();
	}
	//método
	public void atenderCliente() {
		System.out.println("Olá, bem vindo! O que deseja pedir?");
	}
}

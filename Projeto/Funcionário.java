package Projeto;

public class Funcionário extends Pessoa{
	//atributos
	private int registro;
	private String turno;
	//construtores
	public Funcionário(){
	}
	public Funcionário(String nome, char sexo, int telefone, int idade, int registro, String turno) {
	this.registro = registro;
	this.turno = turno;
	}
	//getters e setters 
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro=registro;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String  turno) {
		this.turno=turno;
	}
}

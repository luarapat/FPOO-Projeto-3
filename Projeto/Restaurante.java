package Projeto;
import java.util.List;
public class Restaurante {
	//atributos
	private String nome = "La mama";
	private String local = "Rua oscar freire n654";
	private int capacidadePessoas = 60;
	private int telefone = 989745233;
	private List cardápio;
	//construtores
	Restaurante(){
	}
	Restaurante(String nome, String local, int capacidadePessoas, int telefone,
			List cardápio){
		this.capacidadePessoas = capacidadePessoas;
		this.cardápio = cardápio;
		this.local = local;
		this.nome = nome;
		this.telefone = telefone;
	}
	//getters e setters 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local=local;
	}
	public int getCapacidadePessoas() {
		return capacidadePessoas;
	}
	public void setCapacidadePessoas(int capacidadePessoas) {
		this.capacidadePessoas=capacidadePessoas;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone=telefone;
	}
	public List getCardápio() {
		return cardápio;
	}
	public void setCardápio(List cardápio) {
		this.cardápio=cardápio;
	}
	//método
	public void vender() {
		System.out.println("Compra realizada");
	}
	
}

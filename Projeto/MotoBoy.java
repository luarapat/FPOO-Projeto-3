package Projeto;

public class MotoBoy extends Funcionário{
	//atributos
	//construtor
	public MotoBoy() {
	}
	public MotoBoy(int registro, String turno) {
		super();
	}
	//métodos
	public void andarMoto() {
		System.out.println("Seu pedido foi enviado para entrega!");
	}
	public void entregarPedido() {
		System.out.println("Seu pedido foi entregue!");
	}
}

package Projeto;
public class Pagamento {
	//atributos
	private int numeroCartao;
	private int pix;
	private int boleto;
	//contrutor
	public Pagamento() {
	}
	public Pagamento(int numeroCartao, int pix, int boleto) {
		this.boleto = boleto;
		this.numeroCartao = numeroCartao;
		this.pix = pix;
	}
	//getters e setters
		public int getNumeroCartao() {
			return numeroCartao;
		}
		public void setNumeroCartao(int numeroCartao) {
			this.numeroCartao=numeroCartao;
		}
		public int getBoleto() {
			return boleto;
		}
		public void setBoleto(int boleto) {
			this.boleto=boleto;
		}
		public int getPix() {
			return pix;
		}
		public void setPix(int pix) {
			this.pix=pix;
		}
		//método
		public void escolherFormaDePagamento(boolean escolherFormaDePagamento) {
			if (escolherFormaDePagamento == true) {
				System.out.println("Pagar agora...");
				System.out.println("Voce deseja pagar com: \n1-Pix \n2-Cartão \n3-Boleto");
				
			}else   {
				System.out.println("pagar na entrega...\nMotoboy saiu para entrega...\nPedido entregue!" );
			}
	}
	}


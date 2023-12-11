package Projeto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Atividade_Luara_Patracon.MembroBanda;
public class TesteDelivery {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//instanciando um cliente - cliente 1
		//-----------------------------------------------------------------
		System.out.println("-----------CLIENTE 1 ------------");
		System.out.println("Bem vindo ao nosso site de delivery!\n Informe seus dados para login (Nome, sexo, idade e telefone):");
		Cliente c1 = new Cliente ();
		c1.setNome(entrada.next());
		c1.setSexo( entrada.next());
		c1.setIdade(entrada.nextInt());
		c1.setTelefone(entrada.nextInt());
		System.out.println("Seus dados:\nNome: " + c1.getNome()+ "\nSexo: " + 
		c1.getSexo() + "\nIdade: " + c1.getIdade() + "\nTelefone: " + c1.getTelefone());
		//comecando dados do restaurante
		System.out.println("Ótimo! Você procura um restaurante de qual região?");
		c1.setLocalização(entrada.next());
		System.out.println("Estamos procurando algum estabelecimento aberto...");
		Restaurante r1 = new Restaurante();
		System.out.println("Encontramos! " + "\nRestaurante "+ r1.getNome() +
				"\nEndereço " + r1.getLocal() + "\nCapacidade de pessoas: "
				+ r1.getCapacidadePessoas() + "\nTelefone: " + r1.getTelefone());
		//fazer cardápio
		c1.fazerPedido();
		Restaurante Lasanha = new Restaurante();
		Restaurante Macarrão = new Restaurante();
		Restaurante Strogonoff = new Restaurante();
		Restaurante Fricasse = new Restaurante();
		Restaurante Bife_Acebolado = new Restaurante();
		Lasanha.setNome("1- Lasanha");
		Macarrão.setNome("2- Macarrao");
		Strogonoff.setNome("3- Strogonoff");
		Fricasse.setNome("4- Fricasse");
		Bife_Acebolado.setNome("5- BifeAcebolado");
		List <Restaurante> Pratos = new ArrayList <Restaurante> ();
		Pratos.add(Lasanha);
		Pratos.add(Macarrão);
		Pratos.add(Strogonoff);
		Pratos.add(Fricasse);
		Pratos.add(Bife_Acebolado);
	for (Restaurante opc: Pratos) {
		System.out.println (opc.getNome());
		}
	     int escolha = entrada.nextInt();
	     switch (escolha) {
	     case 1 :
	    	 System.out.println("Seu pedido foi: \n Lasanha\n Preco: R$ 29,99");
	     break;
	     case 2 :
	    	 System.out.println("Seu pedido foi: \n Macarrao \n Preco: R$ 19,99");
	    	 break;	
	     case 3 :
	    	 System.out.println("Seu pedido foi: \n Strogonoff \n Preco: R$ 24,90");
	    	 break;
	     case 4 : 
	    	 System.out.println("Seu pedido foi: \n Fricasse \n Preco: R$ 22,85");
	    	 break;
	     case 5:
	    	 System.out.println("Seu pedido foi: \n Bife acebolado \n Preco: R$ 19,90");
	     }
	     //instanciando funcionarios
		Cozinheiro co1 = new Cozinheiro();
		co1.fazerComida();
		//pagamento
		System.out.println("Enquanto isso... você deseja pagar agora?");
		Pagamento p1 = new Pagamento();
		entrada.nextLine();
		p1.escolherFormaDePagamento(entrada.nextBoolean());
		int escolhas = entrada.nextInt();
	     switch (escolhas) {
	     case 1 :
	    	 System.out.println("Informe o numero do seu pix:");
	    	 p1.setPix(entrada.nextInt());
	     break;
	     case 2 :
	    	 System.out.println("Informe o numero do seu cartão:");
	    	 p1.setNumeroCartao(entrada.nextInt());
	    	 break;	
	     case 3 :
	    	 System.out.println("Informe o número do boleto:");
	    	 p1.setBoleto(entrada.nextInt());
	    	 break;
	     
	     }
	     r1.vender();
	     //instanciando motoboy
	     MotoBoy m1 = new MotoBoy();
	     System.out.println("Coloque sua localização:");
	     c1.setLocalização(entrada.next());
	     m1.andarMoto();
	     System.out.println("Espere um pouco...");
	     m1.entregarPedido();
	   //instanciando um cliente - cliente 2
		//-----------------------------------------------------------------
		System.out.println("-----------CLIENTE 2 ------------");
			System.out.println("Bem vindo ao nosso site de delivery!\n Informe seus dados para login (Nome, sexo, idade e telefone):");
			Cliente c2 = new Cliente ();
			c2.setNome(entrada.next());
			c2.setSexo( entrada.next());
			c2.setIdade(entrada.nextInt());
			c2.setTelefone(entrada.nextInt());
			System.out.println("Seus dados:\nNome: " + c2.getNome()+ "\nSexo: " + 
			c2.getSexo() + "\nIdade: " + c2.getIdade() + "\nTelefone: " + c2.getTelefone());
			//comecando dados do restaurante
			System.out.println("Ótimo! Você procura um restaurante de qual região?");
			c2.setLocalização(entrada.next());
			System.out.println("Estamos procurando algum estabelecimento aberto...");
			Restaurante r2 = new Restaurante();
			System.out.println("Encontramos! " + "\nRestaurante "+ r2.getNome() +
			"\nEndereço " + r2.getLocal() + "\nCapacidade de pessoas: "
			+ r2.getCapacidadePessoas() + "\nTelefone: " + r2.getTelefone());
			//fazer cardápio
			c2.fazerPedido();
			for (Restaurante opc: Pratos) {
				System.out.println (opc.getNome());
				}
			     int escolhass = entrada.nextInt();
			     switch (escolhass) {
			     case 1 :
			    	 System.out.println("Seu pedido foi: \n Lasanha\n Preco: R$ 29,99");
			     break;
			     case 2 :
			    	 System.out.println("Seu pedido foi: \n Macarrao \n Preco: R$ 19,99");
			    	 break;	
			     case 3 :
			    	 System.out.println("Seu pedido foi: \n Strogonoff \n Preco: R$ 24,90");
			    	 break;
			     case 4 : 
			    	 System.out.println("Seu pedido foi: \n Fricasse \n Preco: R$ 22,85");
			    	 break;
			     case 5:
			    	 System.out.println("Seu pedido foi: \n Bife acebolado \n Preco: R$ 19,90");
			     }
			     //instanciando funcionarios
				Cozinheiro co2 = new Cozinheiro();
				co2.fazerComida();
				//pagamento
				System.out.println("Enquanto isso... você deseja pagar agora?");
				Pagamento p2 = new Pagamento();
				p2.escolherFormaDePagamento(entrada.nextBoolean());
				int escolhasss = entrada.nextInt();
			     switch (escolhasss) {
			     case 1 :
			    	 System.out.println("Informe o numero do seu pix:");
			    	 p2.setPix(entrada.nextInt());
			     break;
			     case 2 :
			    	 System.out.println("Informe o numero do seu cartão:");
			    	 p2.setNumeroCartao(entrada.nextInt());
			    	 break;	
			     case 3 :
			    	 System.out.println("Informe o número do boleto:");
			    	 p2.setBoleto(entrada.nextInt());
			    	 break;
			     }
			     r2.vender();
			     //instanciando motoboy
			     MotoBoy m2 = new MotoBoy();
			     System.out.println("Coloque sua localização:");
			     c2.setLocalização(entrada.next());
			     m2.andarMoto();
			     System.out.println("Espere um pouco...");
			     m2.entregarPedido();
	     //instanciando um cliente - cliente 3
		//-----------------------------------------------------------------
		System.out.println("-----------CLIENTE 3 ------------");
		System.out.println("Bem vindo ao nosso site de delivery!\n Informe seus dados para login (Nome, sexo, idade e telefone):");
		Cliente c3 = new Cliente ();
		c3.setNome(entrada.next());
		c3.setSexo( entrada.next());
		c3.setIdade(entrada.nextInt());
		c3.setTelefone(entrada.nextInt());
		System.out.println("Seus dados:\nNome: " + c3.getNome()+ "\nSexo: " + 
		c3.getSexo() + "\nIdade: " + c3.getIdade() + "\nTelefone: " + c3.getTelefone());
		//comecando dados do restaurante
		System.out.println("Ótimo! Você procura um restaurante de qual região?");
		c3.setLocalização(entrada.next());
		System.out.println("Estamos procurando algum estabelecimento aberto...");
		Restaurante r3 = new Restaurante();
		System.out.println("Encontramos! " + "\nRestaurante "+ r3.getNome() +
		"\nEndereço " + r3.getLocal() + "\nCapacidade de pessoas: "
		+ r3.getCapacidadePessoas() + "\nTelefone: " + r3.getTelefone());
		//fazer cardápio
		c3.fazerPedido();
		for (Restaurante opc: Pratos) {
			System.out.println (opc.getNome());
			}
		     int escolhass1 = entrada.nextInt();
		     switch (escolhass1) {
		     case 1 :
		    	 System.out.println("Seu pedido foi: \n Lasanha\n Preco: R$ 29,99");
		     break;
		     case 2 :
		    	 System.out.println("Seu pedido foi: \n Macarrao \n Preco: R$ 19,99");
		    	 break;	
		     case 3 :
		    	 System.out.println("Seu pedido foi: \n Strogonoff \n Preco: R$ 24,90");
		    	 break;
		     case 4 : 
		    	 System.out.println("Seu pedido foi: \n Fricasse \n Preco: R$ 22,85");
		    	 break;
		     case 5:
		    	 System.out.println("Seu pedido foi: \n Bife acebolado \n Preco: R$ 19,90");
		     }
		     //instanciando funcionarios
			Cozinheiro co3 = new Cozinheiro();
			co3.fazerComida();
			//pagamento
			System.out.println("Enquanto isso... você deseja pagar agora?");
			Pagamento p3 = new Pagamento();
			p3.escolherFormaDePagamento(entrada.nextBoolean());
			int escolhasss1 = entrada.nextInt();
		     switch (escolhasss1) {
		     case 1 :
		    	 System.out.println("Informe o numero do seu pix:");
		    	 p3.setPix(entrada.nextInt());
		     break;
		     case 2 :
		    	 System.out.println("Informe o numero do seu cartão:");
		    	 p3.setNumeroCartao(entrada.nextInt());
		    	 break;	
		     case 3 :
		    	 System.out.println("Informe o número do boleto:");
		    	 p3.setBoleto(entrada.nextInt());
		    	 break;
		     }
		     r3.vender();
		     //instanciando motoboy
		     MotoBoy m3 = new MotoBoy();
		     System.out.println("Coloque sua localização:");
		     c3.setLocalização(entrada.next());
		     m3.andarMoto();
		     System.out.println("Espere um pouco...");
		     m3.entregarPedido();
		     
	}

}	
	
  


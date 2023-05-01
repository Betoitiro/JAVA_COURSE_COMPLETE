package DESAFIOS_EXERCICIOS.loja;

public class produto {
	
	String nome;
	double preco;
	double desconto;
	double descontoGerente;

	
	
	produto(){
		
	}
	
	
	produto(String nome, double preco){ //contrutor de produto
		this.nome = nome;
		this.preco = preco;

	}
	double precoDesconto() {
		return preco * (1 - desconto);
	}
	final double descontof = 0.15; //valor atribuido para o desconto do funcionario
	final double descontog = 0.30; //valor atribuido para o valor do gerente
	
	String nomep() {
		return nome;
	}
	
}


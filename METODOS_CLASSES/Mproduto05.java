package METODOS_CLASSES;

public class Mproduto05 {

	String nome;
	double preco;
	double desconto;
	
	
	
	double precoDesconto() { //não recebe nenhum parametr, ja que todos os dados
					//estão dentro do obeto, assim não tem que usar os parametros
		
		return preco * (1 - desconto);
		
		//esse metodo serve para usar em um sistema.
	
	}
	double precoDesconto(double descontoDogerete) {
		return preco *(1 - (desconto + descontoDogerete)); // nesse caso somara o desconto atual, com o desconto acresentado pelo gerente
	}
}

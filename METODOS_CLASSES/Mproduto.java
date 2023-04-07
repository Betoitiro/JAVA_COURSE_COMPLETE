package METODOS_CLASSES;

public class Mproduto {

	String nome;
	double preco;
	double desconto;
	
	double precoDesconto() { //não recebe nenhum parametr, ja que todos os dados
					//estão dentro do obeto, assim não tem que usar os parametros
		
		return preco * (1 - desconto);
		
	}
}

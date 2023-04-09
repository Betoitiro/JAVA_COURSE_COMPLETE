package METODOS_CLASSES;

public class Produto07 {
	
	//tipo, para criar 3 variaveis para pertecerem ao objeto.
	//para que quando for criar um objeto, usar essas variaveis
	
	//USANDO O CONSTRUTOR NESSA CLASSE
	
	String nome;
	double preco;
	double desconto;
	
	Produto07(String primeiroNome, double nP){
		nome = primeiroNome;
		preco = nP;
	}
	//se colocar um contrutor padrão que n receba nenhum metdo, ira a funcionalidade continuara a mesma
	//da maneira que foi colocanda anteriormente
	
	Produto07(){
		
	}
	
	double preçoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - (desconto + descontoDoGerente));
		}
}

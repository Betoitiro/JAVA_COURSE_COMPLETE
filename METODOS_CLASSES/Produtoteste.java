package METODOS_CLASSES;


public class Produtoteste {
	
	public static void main(String[] args) {
		//para usar as variaveis do objeto, tem que usar o nome da classe
		//usando uma variavel p1
		//colocando new produto
		Produto p1 = new Produto();
		p1.nome = "celular";
		p1.preco = 4000.00;
		p1.desconto = 0.30;
		
		
		//para criar outra variavel, usa:
		//var p3 =  new Produto,
		//Produto é o nome da classe que foi salva com as variaveis
		var p2 = new Produto();
		p2.nome = "mouse pad";
		p2.preco = 50.00;
		p2.desconto = 0.25;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double pf = p1.preco * (1 - p1.desconto);
		double pf2 = p2.preco * (1 - p2.desconto);
		
		double md = (pf + pf2)/2;
		//System.out.println("a media dos produtos é de " + (pf + pf2) / 2);
		System.out.printf(" A media da lista de desejos = R$%.2f", md);
	}
}

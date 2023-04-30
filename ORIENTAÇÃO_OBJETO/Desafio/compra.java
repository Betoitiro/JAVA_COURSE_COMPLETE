package ORIENTAÇÃO_OBJETO.Desafio;

import java.util.ArrayList;
import java.util.List;

public class compra {

	List<item> itens = new ArrayList<>();
	
	void addintem(produto p, int quantidade) {
		this.itens.add(new item(p, quantidade));
	}
	void addintem(String nome,double preco, int quantidade) {
		var produto = new produto(nome,preco);
		this.itens.add(new item(produto, quantidade));
	}
	
	
	
	double obtvalortotal () {
		double total = 0;
		
		for(item i1 : itens) { //o i1 referesse ao nome da variavel,
			//item, referesse ao nome da classe
			//intens do final referesse ao list que foi chamado
			total += i1.quantidade * i1.Produto.preco;
		}
		return total;
	}
}

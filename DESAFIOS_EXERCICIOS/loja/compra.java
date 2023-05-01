package DESAFIOS_EXERCICIOS.loja;

import java.util.ArrayList;
import java.util.List;

public class compra {

	List<item> itens = new ArrayList<>();
	
		void additem(produto p, int quantidade) {
			this.itens.add(new item(p, quantidade));
			
		}
		void additem(String nome, double preco, int quantidade) {
			var produto =  new produto(nome, preco);
			this.itens.add(new item(produto, quantidade));
		}
		double valortotal() {
			double total = 0;
			
			for(item i2: itens) {
				
				total+= i2.quantidade * i2.prod.preco;
			}
			
			return total;
		}
		
}
	
	


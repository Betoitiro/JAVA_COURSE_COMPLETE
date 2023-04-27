package ORIENTAÇÃO_OBJETO;

import java.util.ArrayList;

public class compra {
	
	
	String cliente;
	ArrayList<intem> intens = new ArrayList<intem>();
	
	
	double valorT () {
		double total = 0;
		
		for(intem Item : intens) {
			total += Item.quantidade * Item.preco;
		}
		return  total;
	}
}

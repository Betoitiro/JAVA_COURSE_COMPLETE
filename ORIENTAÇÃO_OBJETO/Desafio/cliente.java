package ORIENTAÇÃO_OBJETO.Desafio;

import java.util.ArrayList;
import java.util.List;

public class cliente {

	final String nome;
	final List<compra> compras = new ArrayList<>();
	
	cliente(String nome){
		this.nome = nome;
	}
	double obterValortotal() {
		double total = 0;
		
		for(compra c1: compras) {
			total += c1.obtvalortotal();
		}
		
		return total;
	}
}

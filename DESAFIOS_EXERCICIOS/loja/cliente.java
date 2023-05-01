package DESAFIOS_EXERCICIOS.loja;

import java.util.ArrayList;
import java.util.List;

public class cliente {
	
	String nome;
	List<compra> comp = new ArrayList<>();
	
	cliente(String nome){
		this.nome = nome;
	}
	cliente(){
		
	}
	
	double valtol() { //construtor para calcular o valor total
		double total =0;
		
		for(compra c1 : comp) {
			total += c1.valortotal();
		}
		return total;
	}
	
	
}

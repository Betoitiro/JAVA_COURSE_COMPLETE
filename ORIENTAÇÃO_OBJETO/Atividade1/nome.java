package ORIENTAÇÃO_OBJETO.Atividade1;

import java.util.ArrayList;
import java.util.List;

public class nome {

	String nome;
	
	List<idade> idade = new ArrayList<>();
	
	nome(String nome){
		this.nome = nome;
	}
	
	void addidade(int idade) {
		this.idade.add(new idade(idade));
	}
			
}

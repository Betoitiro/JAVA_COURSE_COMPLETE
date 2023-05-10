package ORIENTAÇÃO_OBJETO.encapsulamentoCasaB;

import ORIENTAÇÃO_OBJETO.encapsulamentoCasaA.Ana;

public class Julia {

	void testeAcesso() {
	
		Ana sogra = new Ana();
		
		System.out.println(sogra.todosSabem);//o unico atributo a ser acessado por julia, sera oq todos sabem.
		//devido ao nivel de encapsulamento, e como julia não herda ana, ela so consiguira acessar oq for public de ana.
			
	}
	
}

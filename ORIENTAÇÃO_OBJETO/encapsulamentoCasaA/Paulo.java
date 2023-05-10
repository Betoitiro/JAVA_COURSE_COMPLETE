package ORIENTAÇÃO_OBJETO.encapsulamentoCasaA;

public class Paulo {

	Ana esposa = new Ana();
	
	void testeAcesso() { //sera realizado um teste de acesso da pasta
		//Segredo
		//focoDentroDeCasa
		//formaDeFalar
		//todosSabem
		
		//System.out.println(esposa.segredo); não consegue ser acessado
		System.out.println(esposa.focoDentroDeCasa);//consegue ser acessado
		System.out.println(esposa.formaDeFalar);//consegue ser acessado
		System.out.println(esposa.todosSabem);//consegue ser acessado ja que é um atributo public
		
	}
	
}

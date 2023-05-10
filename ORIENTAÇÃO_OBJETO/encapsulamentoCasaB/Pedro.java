package ORIENTAÇÃO_OBJETO.encapsulamentoCasaB;

import ORIENTAÇÃO_OBJETO.encapsulamentoCasaA.Ana;

public class Pedro extends Ana{
	
	//Ana mae = new Ana(); como Pedro herdou de ana, não precisa de um atributo mãe para chamar as caracteristicas de ana
	
	void testeAcesso() {
		//Segredo
		//focoDentroDeCasa
		//formaDeFalar
		//todosSabem
		System.out.println(formaDeFalar);//Herdado por herança
		//outa maneira de chamar os atributos de ana
		System.out.println(new Ana().todosSabem);//Herdado por herança e por ser publico.
		//como foi herdado, não precisamos de um atributos para chamar os atributos de ana
	}

}

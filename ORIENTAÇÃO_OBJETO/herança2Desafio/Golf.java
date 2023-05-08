package ORIENTAÇÃO_OBJETO.herança2Desafio;

public class Golf extends Carro {
	
	
	Golf(){
		this(250);
	}
	
	Golf(int VelocidadeMAxima){
		super(120);
		delta = 25;
	}

//	@Override
//	void acelerar() {
	//	velocidadeAtual +=15;
//	}
}

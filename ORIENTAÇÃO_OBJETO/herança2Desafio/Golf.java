package ORIENTAÇÃO_OBJETO.herança2Desafio;

public class Golf extends Carro {
	
	
	public Golf(){
		this(250);
	}
	
	public Golf(int VelocidadeMAxima){
		super(120);
		delta = 25;
	}

//	@Override
//	void acelerar() {
	//	velocidadeAtual +=15;
//	}
}

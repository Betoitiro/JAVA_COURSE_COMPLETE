package ORIENTAÇÃO_OBJETO.herança2Desafio;

public class Golf extends Carro implements Esportivo {
	//implements serve para dizer que determinada classe, implementa uma interface
	
	public Golf(){
		this(250);
	}
	
	public Golf(int VelocidadeMAxima){
		super(120);
		delta = 25;
	}
	
	@Override
	public void LigarTurbo() {//herda da interface
		delta = 40;
	}
	@Override
	public void DesligarTurbo() { //herda da interface
		delta = 25;
	}

//	@Override
//	void acelerar() {
	//	velocidadeAtual +=15;
//	}
}

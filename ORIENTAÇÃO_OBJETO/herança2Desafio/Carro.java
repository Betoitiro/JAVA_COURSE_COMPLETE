package ORIENTAÇÃO_OBJETO.herança2Desafio;

public class Carro {

	int velocidadeAtual;
	final int VELOCIDADE_MAX;
	int delta = 5;
	
	protected Carro(int VelocidadeMAxima){
		VELOCIDADE_MAX = VelocidadeMAxima;
	}
	

	public void acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAX) {
			velocidadeAtual = VELOCIDADE_MAX;
		}else {
			velocidadeAtual +=delta;	
		}
	}
	public void freai() {
		velocidadeAtual -=5;
		if(velocidadeAtual >=5) {
			velocidadeAtual -=5;
		}else {
			velocidadeAtual =0;
		}
	}
	
	public String toString() {
		return "velocidade atual " + velocidadeAtual + "Mp/h";
	}
}

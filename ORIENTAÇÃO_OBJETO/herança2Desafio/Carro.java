package ORIENTAÇÃO_OBJETO.herança2Desafio;

public class Carro {

	int velocidadeAtual;
	final int VELOCIDADE_MAX;
	int delta = 5;
	
	public Carro(int VelocidadeMAxima){
		VELOCIDADE_MAX = VelocidadeMAxima;
	}
	

	void acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAX) {
			velocidadeAtual = VELOCIDADE_MAX;
		}else {
			velocidadeAtual +=delta;	
		}
	}
	void freai() {
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

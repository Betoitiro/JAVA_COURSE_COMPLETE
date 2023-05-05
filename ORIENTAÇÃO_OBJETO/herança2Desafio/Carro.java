package ORIENTAÇÃO_OBJETO.herança2Desafio;

public class Carro {

	int velocidadeAtual;
	
	void acelerar() {
		velocidadeAtual +=5;
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

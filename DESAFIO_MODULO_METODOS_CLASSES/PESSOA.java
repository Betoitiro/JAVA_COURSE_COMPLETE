package DESAFIO_MODULO_METODOS_CLASSES;

public class PESSOA {
	String nome;
	double peso;
	
	PESSOA(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(COMIDA comida) {
		if (comida != null) {
			this.peso += comida.peso;
		}
	}
	String apresentar() {
		return "Ola me chamo " + nome + " e peso " + peso + "kgs";
	}
}

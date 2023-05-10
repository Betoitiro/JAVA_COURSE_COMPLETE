package ORIENTAÇÃO_OBJETO.Polimorfismo;

public class Pessoa {

	private double peso;
	
	public Pessoa(double peso) {
		setPeso(peso);
	}
	
	//atribuindo metodos as açoes da pessoa
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}

	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0)
		this.peso = peso;
	}
	
}

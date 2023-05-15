package ORIENTAÇÃO_OBJETO.herança2Desafio;

public class GolModificado extends Carro implements Esportivo{

	public GolModificado() {
		this(260);
	}

	public GolModificado(int VelocidadeMAxima) {
		super(260);
		delta = 35;
	}
	
	@Override
	public void LigarTurbo() {
		delta = 45;
	}
	@Override
	public void DesligarTurbo() { //herda da interface
		delta = 25;
	}
}

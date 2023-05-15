package OO;

public class carro {
	
	
	//RELAÇÃO BIDIRECIONAL
	//RELAÇÃO UM PARA UM
	
	
	Motor motor = new Motor();
	
	void acelerar() {
		if (motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;
			
		}
	}
	
	void frear() {
		if(motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -=0.4;
		}
	}
	
	void ligar () {
		motor.ligado = true;
	}
	
	void desligado () {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}

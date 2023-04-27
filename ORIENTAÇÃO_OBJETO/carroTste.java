package ORIENTAÇÃO_OBJETO;


public class carroTste {
	
	public static void main(String[] args) {
		
		carro c1 = new carro();
		
		System.out.println(c1.estaLigado()); //desligado
		
		c1.ligar(); //comando para ligar
		System.out.println(c1.estaLigado()); //ligado
		
		System.out.println(c1.motor.giros() + "RPM");
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println(c1.motor.giros() + "RPM ");
		
		//COLOCAMOS UM LIMITE NA FUNÇÃO FREAR NA CLASSE DO MOTOR
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		System.out.println(c1.motor.giros() + "RPM");
		
		// FALTOU EMCAPSULAMENTO!!!!
		//c1.motor.fatorInjecao = -20;
		//System.out.println(c1.motor.giros());
		
	}
}

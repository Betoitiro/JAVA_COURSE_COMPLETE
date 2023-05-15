package OO;


public class carroTste {
	
	public static void main(String[] args) {
		
		//RELAÇÃO BIDIRECIONAL
		//RELAÇÃO UM PARA UM
		
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
		
		//OU SEJA, INDEPENDENTE DAS VEZES QUE CHAMARMOS A FUNÇÃO FREAR, O MINIMO DE GIROS SERA 600 RPM
		
		System.out.println(c1.motor.giros() + "RPM");
		
		// FALTOU EMCAPSULAMENTO!!!!
		//c1.motor.fatorInjecao = -20;
		//System.out.println(c1.motor.giros());
		
	}
}

package ORIENTAÇÃO_OBJETO.teste;

import ORIENTAÇÃO_OBJETO.herança2Desafio.Carro;
import ORIENTAÇÃO_OBJETO.herança2Desafio.Gol;
import ORIENTAÇÃO_OBJETO.herança2Desafio.Golf;

public class TesteCarro {

	public static void main(String[] args) {
		System.out.println("Teste Speed Gol");
		
		Carro c1 = new Gol();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println(c1);
		//System.out.println(c1);
		c1.acelerar();
		
		System.out.println(c1);
		//System.out.println(c1);
		c1.acelerar(); //limitou a velocidade nesse chamado acelerar
		c1.acelerar();
		System.out.println(c1);
	 	
		System.out.println("Test Speed Golf");
		
		Golf g1 = new Golf(120);// esse metodo pode ser definido onde se encontra o construtor padrão
		g1.acelerar();
		g1.acelerar();
		g1.acelerar();
		g1.acelerar();//os proximos comandos de acelerar n irão passar, por conta do construtor que esta na velocidade maxima
		g1.acelerar();
		g1.acelerar();
		
		System.out.println(g1);

		
		Golf g2 = new Golf();
		g2.acelerar();
		g2.acelerar();
		g2.acelerar();
		g2.acelerar();
		g2.acelerar();
		g2.acelerar();
		g2.acelerar();
		g2.acelerar();
		g2.acelerar();
		
		System.out.println(g2);
		
	}
}

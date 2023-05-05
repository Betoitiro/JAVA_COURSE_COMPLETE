package ORIENTAÇÃO_OBJETO.herança2Desafio;


public class TesteCarro {

	public static void main(String[] args) {
		System.out.println("Teste Speed Gol");
		
		Carro c1 = new Gol();
		c1.acelerar();
		//System.out.println(c1);
		c1.acelerar();
		//System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		
		System.out.println("Test Speed Golf");
		
		Golf g1 = new Golf();
		g1.acelerar();
		g1.acelerar();
		System.out.println(g1);
	}
}

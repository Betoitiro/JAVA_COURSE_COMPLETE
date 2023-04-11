package DESAFIO_MODULO_METODOS_CLASSES;

public class JANTAR {
	
	public static void main(String[] args) {
		
		COMIDA c1 = new COMIDA("Arroz", 0.225);
		COMIDA c2 = new COMIDA("carne", 0.500);
		
		PESSOA p1 = new PESSOA("paulo", 89.775);
		System.out.println(p1.apresentar());
		p1.comer(c2);
		System.out.println(p1.apresentar());
		
		p1.comer(c2);
		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());
		
	}
}

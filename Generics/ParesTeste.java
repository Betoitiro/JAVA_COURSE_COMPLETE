package Generics;

public class ParesTeste {

	public static void main(String[] args) {
		
		Pares<Integer,String> resultadoC = new Pares<Integer, String>();
		
		resultadoC.adicionar(1, "João");
		resultadoC.adicionar(2, "Fernando");
		resultadoC.adicionar(3, "Natam");
		resultadoC.adicionar(1, "Humberto");
		
		System.out.println(resultadoC.getValor(1));
	}
}

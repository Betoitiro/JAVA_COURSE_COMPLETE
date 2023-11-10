package Generics;

public class CaixaNumeroTste {

	public static void main(String[] args) {
		//Foi acrescentada uma restrição a herança que todas os tipos tem que ser do tipo number
		CaixaNum<Double> cA = new CaixaNum<Double>();
		cA.gaurdar(1.523);
		
		Double coisa = cA.abrir();
		System.out.println(coisa);
		
		CaixaNum<Integer> cB = new CaixaNum<Integer>();
		cB.gaurdar(12356);
		
		System.out.println(cB.abrir());
	}
}

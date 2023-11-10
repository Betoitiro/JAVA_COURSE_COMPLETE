package Generics;

public class CaixaTeste {

	public static void main(String[] args) {
		
		/*
		 * Com generics: Consegue definir tipos que serão resolvidos em outro momento 
		 */
		
		
		//Seta o tipo da caixa na hora
		Caixa<String> ca = new Caixa<>();
		ca.gaurdar("Teste de String");
		
		System.out.println(ca.abrir());
		
		//setando o Tipo da classe na hora
		Caixa<Double> cb = new Caixa<>();
		cb.gaurdar(2.55);
		
		//sem usar cast
		Double coisab = cb.abrir();
		System.out.println(coisab);
	}
}

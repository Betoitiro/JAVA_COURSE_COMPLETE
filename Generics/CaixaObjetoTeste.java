package Generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
		
		
		/*o conceito de generics é basicamente criar uma classe gerenica e quando for
		*compilar, se descreve o seu tipo
		*
		*/
		
		
		CaixaObjeto ca = new CaixaObjeto();
		ca.agaurdar(2.3); //double -> Double
		
		/*
		//cast
		 * teria que estar explicito, de double para double
		Integer coisa = (Integer)ca.abrir();
		*/
		
		//cast 
		Double coisa = (Double) ca.abrir();
		System.out.println(coisa);
		
		CaixaObjeto cb = new CaixaObjeto();
		cb.agaurdar("String guardada");
		
		String coisaB = (String) cb.abrir();;
		System.out.println(coisaB);
		
	}
}

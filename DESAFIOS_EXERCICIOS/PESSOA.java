package DESAFIOS_EXERCICIOS;

public class PESSOA {
	
	public static void main(String[] args) {
		//exercicio usando os dois metodos de contrutor
		
		definiçãopessoa d1 = new definiçãopessoa();
		d1.nome = "Roberval";
		d1.idade = 47;
		d1.altura = 1.79;
		d1.peso = 89.78;
		
		System.out.println("definição do usuario: ");
		System.out.println("O nome: " + d1.nome);
		System.out.println("idade : " + d1.idade + "ans");
		System.out.println("altura: " + d1.altura + "metros");
		System.out.println("peso: " + d1.peso +"kg");
		
		System.out.println();
		definiçãopessoa d2 = new definiçãopessoa( "julia", 29,  59.78,  1.59); 
		
		System.out.println("definição usuario 2:");
		System.out.println("nome: " + d2.nome);
		System.out.println("idade: "+ d2.idade);
		System.out.println("peso: " + d2.peso);
		System.out.println("altura: " + d2.altura);
		
	}
}

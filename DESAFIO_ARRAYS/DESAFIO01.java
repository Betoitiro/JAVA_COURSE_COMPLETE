package DESAFIO_ARRAYS;

import java.util.Scanner;

public class DESAFIO01 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Deseja inserir quantas notas do aluno: ");
		int qnotas = entrada.nextInt();
		
		double [] notas = new double [qnotas];
		
		for (int i = 0; i < notas.length; i++) { //loop for dedicado a receber as notas na variavel notas
			System.out.print("informe a nota: "+ (i+1)+ " : ");
			notas[i] = entrada.nextInt();
		}
		double total = 0;// vai somar as notas inseridas
		for(double nota : notas){ //loop for somar a quantidade total dada pelas notas
			total += nota;//total vai somar todas as notas inseridas
		}
		double media = total/notas.length; //variavel para calcular a media
		System.out.println("a media do aluno sera de: " + media + "!");
		
		entrada.close();
	}
}

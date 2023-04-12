package ARRAYS;

import java.util.Arrays;

public class EXERCICIO {
	
	public static void main(String[] args) {
		
		double [] notasAlunox = new double[3];
		
		Arrays.toString(notasAlunox); //comando usado para conseguir chamar o array dentro do System.out.println
		//System.out.println(Arrays.toString(notasAlunox));//quando inicializado todos os elementos são iguais a 0
		
		notasAlunox [0] = 7.9;
		notasAlunox [1] = 8;
		notasAlunox [2] = 9.7;
		
		
		System.out.println(Arrays.toString(notasAlunox));
		
		double totalAlunox = 0;//forma de percorrer o array
		for(int i = 0; i <3; i++) {
			totalAlunox += notasAlunox[i];
		}
		
		System.out.println("a media do aluno x é " + totalAlunox/3);
		
		System.out.println("segunda nota " + notasAlunox[1]);//comando para ver apenas uma nota do aluno
		
		final double pontoExtra = 6.5; //constante criada que é possivel colocar dentro do array
		double [] notasAulunoz = {5.6, 9.5, 7.0, pontoExtra}; //array com dados literais
														//caso menos usado
		
		double totalAlunoz = 0;
		for (int i = 0; i < notasAulunoz.length; i++) { //se usar o for e der ctrl espaço, tem a opção for em array
			totalAlunoz += notasAulunoz[i];
			
		}
		System.out.println(totalAlunoz/notasAulunoz.length);
		System.out.println(notasAulunoz[0]); //como imprimir um elemento especifico dentro do array
		System.out.println(notasAulunoz[2]);
		
	}
}

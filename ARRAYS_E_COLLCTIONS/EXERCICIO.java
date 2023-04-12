package ARRAYS_E_COLLCTIONS;

import java.util.Arrays;

public class EXERCICIO {
	
	public static void main(String[] args) {
		
		double [] notasAlunox = new double[3];
		
		System.out.println(Arrays.toString(notasAlunox));//quando inicializado todos os elementos são iguais a 0
		
		notasAlunox [0] = 7.9;
		notasAlunox [1] = 8;
		notasAlunox [2] = 9.7;
		
		Arrays.toString(notasAlunox); //comando usado para conseguir chamar o array dentro do System.out.println
		
		System.out.println(Arrays.toString(notasAlunox));
		
		double totalAlunox = 0;//forma de percorrer o array
		for(int i = 0; i <3; i++) {
			totalAlunox += notasAlunox[i];
		}
		
		System.out.println(totalAlunox/3);
		
		double [] notasAulunoz = {5.6, 9.5, 7.0, 4.9};
		
		double totalAlunoz = 0;
		for (int i = 0; i < notasAulunoz.length; i++) { //se usar o for e der ctrl espaço, tem a opção for em array
			totalAlunoz += notasAulunoz[i];
			
		}
		System.out.println(totalAlunoz/notasAulunoz.length);
		
	}
}

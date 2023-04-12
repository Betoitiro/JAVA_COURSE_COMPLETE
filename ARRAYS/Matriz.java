package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe quantos alunos tem na sala: ");
		int qalunos = entrada.nextInt();
		
		System.out.print("Informe a quantidade de notas: ");
		int qnotas = entrada.nextInt();
		
		double [][] notasGeral = new double [qalunos][qnotas];
		
		double total = 0;
		for (int a = 0; a < notasGeral.length; a++) {
			for (int n = 0; n < notasGeral.length; n++) {
				
				System.out.printf("Informe a nota %d do aluno %d: "
						, n + 1,a + 1);
				notasGeral[a][n] = entrada.nextDouble();
				total += notasGeral[a][n];
			}
			
		}
		
		double media = total /(qalunos * qnotas);
		System.out.println("a media da turma é de: " + media);
		
		for(double[] notasDoalun : notasGeral) {
			System.out.println(Arrays.toString(notasDoalun));
		}
		
		entrada.close();
	}
}

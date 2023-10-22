package Lambda;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BinaryOperator {

	public static void main(String[] args) {
	/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de alunos: ");
		int c = sc.nextInt();
		for(int i=0; i<c; i++) {
			System.out.println("informe a primeira nota: ");
			double n1 = sc.nextDouble();
			
			System.out.println("Informe a segunda nota: ");
			double n2 = sc.nextDouble();
			
			java.util.function.BinaryOperator<Double> media = (nota1,nota2) -> (nota1 + nota2) /2;
			
			double resultado = media.apply(n1, n2);
			
			if(resultado <7) {
				System.out.println("O aluno foi reprovado");
			}
			
			System.out.println("Media" + resultado);
		}
		sc.close();
		
		*/
		
		java.util.function.BinaryOperator<Double> Media = (n1,n2) -> (n1 + n2)/2;
		System.out.println(Media.apply(8.0, 5.5));
		
		Function<Double, String> conceito = 
				m-> m >=7 ? "Aprovado" : "Reprovado";
				
		System.out.println(Media.andThen(conceito).apply(8.4, 5.6));
		
		
		BiFunction<Double, Double,String> resultado = (n1, n2) ->{
			double mediaF = (n1 + n2) /2;
			return mediaF >=7 ? "Aprovado" : "Reprovado";
			
			//O simbulo de ? -> significca 
		};
		
		System.out.println(resultado.apply(9.5, 4.5));
		
		
	}
	
}

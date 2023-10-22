package Lambda;

import java.util.function.UnaryOperator;

public class BOperatorUnary {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> Somardois = n -> n +2;
		UnaryOperator<Integer> Multiplicar = n -> n*2;
		UnaryOperator<Integer> Quadrado = n -> n*n;
		
		int resultado1 = Somardois.andThen(Multiplicar).andThen(Quadrado).apply(0);
		
		System.out.println(resultado1);
		
		//usando o compose para mudar a sequencia dos fatos que serão execultados
		int resultado2 = Somardois.andThen(Multiplicar).andThen(Multiplicar).apply(0);
		
		System.out.println(resultado2);
	}
}

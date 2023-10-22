package Lambda;

import java.util.function.Predicate;

public class PredicateCompose {

	public static void main(String[] args) {
		
		Predicate<Integer> ispar = num -> num % 2 ==0;
		Predicate<Integer> maiorQtres = num -> num >=100 && num <=999;
		
		//se o numero for par e tiver mais que 3 digitos
		System.out.println(ispar.and(maiorQtres).test(122));
		
		//se o numero for par ou tiver 3 digitos
		System.out.println(ispar.or(maiorQtres).test(123));
		
		//O negate vai retornar a negativa de um predicate, ou seja, na maioria dos casos vai da true o resultado
		System.out.println(ispar.and(maiorQtres).negate().test(22));
	}
}

package Generics;

import java.util.List;

public class ListUtil {

	public static Object getUltimo1(List<?> Lista) {
		/*
		 * List<?> Lista) -> signifca que a lista pode ser de qualquer coisa
		 * 
		 * List<? extends Objexct> Lista) -> Lista so pode herdar algo de object
		 * 
		 * 
		 */
		return Lista.get(Lista.size() -1);
	}
	/*
	 * O tipo T é oq vai ser difinido na lista, e o qual sera retornado
	 * Assim n se faz necessairio fazer o cast
	 */
	public static <T>T getUltimo2(List<T> Lista) {
		return Lista.get(Lista.size() -1);
	}
	
}

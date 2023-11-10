package Generics;

import java.util.Arrays;
import java.util.List;

public class ListautilTeste {

	public static void main(String[] args) {
		
		
		//tem que fazer o cast (Geralmente n é bem sucedido)
		List<String> langs = Arrays.asList("JS", "php", "java", "c++");
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
		
		String ultimalinguagem = (String)ListUtil.getUltimo1(langs);
		System.out.println(ultimalinguagem);
		
		//tem que fazer o cast (Geralmente n é bem sucedido)
		Integer ultimonum = (Integer)ListUtil.getUltimo2(nums);
		System.out.println(ultimonum);
		
	}
}

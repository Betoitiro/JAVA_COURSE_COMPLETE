package COLLECTTION;

import java.util.HashSet;

public class conjuntoBagunçado {
	public static void main(String[] args) {
		
		//usando a colletion set
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); //double => Double
		conjunto.add(true);	//booleann -> Boolean
		conjunto.add("teste");	
		conjunto.add(1);	//int -> integer
		conjunto.add('x');
		
		System.out.println("tamanho é " + conjunto.size());//ao invez do lengh usa size para mostrar o tamanho
		
		conjunto.add("TEste"); //resultado sera falso
		conjunto.add('x');
		
		System.out.println("tamanho é " + conjunto.size()); //ver o tamanho da coleção
		
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("o tamanho é " + conjunto.size());
		
		System.out.println(conjunto.remove(1));//remover um intem
		System.out.println("o tamanho do conjunto é: "+conjunto.size());
		
		System.out.println(conjunto.contains(true));//comando para ver se o conjunto contem ou n o intem
		System.out.println(conjunto.contains(false));//comando para ver se o conjunto contem ou n o intem
	}
}

package COLLECTTION;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SET__conjuntoComportado {
	
	public static void main(String[] args) {
		
		Set <String> lista = new HashSet <String>();
		
		lista.add("marcos"); //com os simbulos <> epecificando o tipo, so ira receber aquele tipo
		lista.add("ana");
		lista.add("carlos");
		lista.add("lucas");
		
		for(String candidato :lista) {
			System.out.println(candidato);
			
		}
		System.out.println();
		
		SortedSet<String> lista2 = new TreeSet<>(); //set para que n tenha duplicação e mantenha a ordem de sessão
		lista2.add("joão");
		lista2.add("luana");
		lista2.add("marina");
		
		for(String cadidatoCancelado : lista2) {
			System.out.println(cadidatoCancelado);
		}
		
		Set<Integer> num = new HashSet<>();
		num.add(3);
		num.add(5);
		num.add(7);
		num.add(123);
		
		for(int numers : num) {
			System.out.println(numers);
		}
	}
}

package COLLECTTION;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class conjuntoComportado {
	
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
		
		SortedSet<String> lista2 = new TreeSet<>();
		lista2.add("joão");
		lista2.add("luana");
		lista2.add("marina");
		
		for(String cadidatoCancelado : lista2) {
			System.out.println(cadidatoCancelado);
		}
	}
}

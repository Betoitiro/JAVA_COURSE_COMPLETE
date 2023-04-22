package COLLECTTION;

import java.util.LinkedList;
import java.util.Queue;

public class fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("ANA"); //laçaa uma execeção  caso a fila esteja cheia
		fila.offer("Bia"); //retorn falso caso a fila esteja cheia
		fila.offer("Daniel");
		fila.offer("rafaela");
		
		//vai busca o elemento na fila
		System.out.println(fila.peek()); //retorna null, caso a fila esteja fazia
		System.out.println(fila.element()); //lança uma excessão
		System.out.println(fila.size());//contara os elementos da lista
		
		//fila.size(); ira contar os elementos da lista
		//fila.clear(); para limpar a fila
		//fila.isEmpy(); para saber se a lista esta fazia
		
		System.out.println(fila.poll());//retorna o elemento da fila ja removendo
										//o primeiro elemento da lista
		System.out.println(fila.poll());
		
		//System.out.println(fila.remove());//a diferença desse pro remove, é que quando chega
		//ao fim da fila, o remove ira da um erro!
		
		
		
	}
}

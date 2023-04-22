package COLLECTTION;

import java.util.ArrayDeque;
import java.util.Deque;

public class pilha {
	
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		
		//a unica diferença no comportamento, é que nesse metodo de pilha
		//o ultimo a entrar é o primeiro a sair
		//o comportamento desse metodo corresponde ao mesmo da fila
		
		livros.add("pequeno principe"); //comando para adicionar um elemento
		livros.push("Don Quixote");
		livros.push("a pequena seria");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		
	}

}

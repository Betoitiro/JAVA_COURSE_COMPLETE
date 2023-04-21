package COLLECTTION;

import java.util.ArrayList;

public class LIST {

	public static void main(String[] args) {
		
		ArrayList<LISTusuario> lista = new ArrayList<>();
		
		
		lista.add(new LISTusuario("carolos"));
		lista.add(new LISTusuario("ana"));
		lista.add(new LISTusuario("bety"));
		lista.add(new LISTusuario("mano"));
		
		System.out.println(lista.get(1).nome);//acessar pelo indice
		
		System.out.println("removida" + lista.remove(1));//removendo pelo indice
		System.out.println("esta contida?" +lista.remove(new LISTusuario("ana"))); //vai retornar se o usuario foi excluido ou n 
		
		System.out.println("esta contida?" +lista.contains("manu"));
		
		for(LISTusuario u : lista) {
			System.out.println(u.toString()); //usar o metdo criado no construtor
		}
		
	}
}

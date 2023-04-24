package COLLECTTION;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class map {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); //mostra o conjunto das chaves de maneira não ordenada
		System.out.println(usuarios.values());	// mostra os valores
		System.out.println(usuarios.entrySet()); //pega chave  e valor ao mesmo tempo
		
		System.out.println(usuarios.containsKey(3)); //verificar s o conjunto das chave esta presente no mapa
		System.out.println(usuarios.containsValue("rebeca")); //verificar se o "valor" esta presente no mapa
		
		System.out.println(usuarios.get(2)); // buscar o valor, de acordo com a chave
		
		for(int chave : usuarios.keySet()) { //foreach para percorrer usando a chave 
			System.out.println(chave);
		}
		
		for(String valor : usuarios.values()) { //foreach para percorrer usando o valor
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro : usuarios.entrySet()) { //foreach para percorrer os dois
			System.out.print(registro.getKey() + "==>");
			System.out.println(registro.getValue());
		}
		
	}
}

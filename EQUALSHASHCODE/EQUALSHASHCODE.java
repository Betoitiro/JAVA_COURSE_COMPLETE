package EQUALSHASHCODE;

import java.util.Date;

public class EQUALSHASHCODE {
	
	public static void main(String[] args) {
		
		USUARIO u = new USUARIO();
		u.nome = "jeferson";
		u.email = "jerfeson@gmail.com";
		

		USUARIO u2 = new USUARIO();
		u2.nome = "jeferson";
		u2.email = "jerfeson@gmail.com";
			
		System.out.println(u == u2);
		System.out.println(u.equals(u2)); //com a configuração do equals na classe usuario, fez com que o prgrama reconhecesse  
											// os usuarios como iguais, caso seja necessario
		System.out.println(u2.equals(u));
		
		System.out.println(u2.equals(new Date()));
	}
}

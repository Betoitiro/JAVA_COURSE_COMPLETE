package EQUALSHASHCODE;

public class PP {
	
	public static void main(String[] args) {
		
		USER2 u2 = new USER2();
		u2.nome = "jurandir";
		u2.idade = 18;
		u2.email = "jurandir@gmail.com";
		
		USER2 u3 = new USER2();
		u3.nome = "picanha";
		u3.idade = 1;
		u3.email = "picanha@gmail.com";
		
		USER2 u4 = new USER2 ();
		u4.nome ="jurandir";
		u4.idade = 18;
		u4.email ="jurandir@gmail.com";
		
		System.out.println(u2.equals(u4));//pela funcionalidade do equals e do hashcode, as duas setenças irão da true
		System.out.println(u4.equals(u2));
		System.out.println(u2.equals(u3));//como os valores são diferentes o sistema equals e hashcode, o resultado sera flase
		System.out.println(u4.equals(u3));
	}
}

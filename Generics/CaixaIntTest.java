package Generics;

public class CaixaIntTest {

	public static void main(String[] args) {
		
		CaixaInt caixaa = new CaixaInt();
		caixaa.gaurdar(123);
		
		/*
		 * quando herda o tipo a hora da herança, faz necessario colocar o tipo na hora que for gardar o resultado em uma
		 * variavel
		 */
		Integer coisaa = caixaa.abrir();
		System.out.println(coisaa);
	}
}

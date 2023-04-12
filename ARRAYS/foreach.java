package ARRAYS;

public class foreach {
	
	public static void main(String[] args) {
		
		double [] notas = {9.8, 5.7,3.8,10 };
		
		for (int i = 0; i  < notas.length; i ++) {
			System.out.print(notas[i] + " "); //para mostrar todos na mesma linha teria que colocar apenas print 
		}
		System.out.println();//quebra de linha 
		
		for(double nota: notas) { //outra maneira de usar a função for
			System.out.print(nota + " ");
			
		}
	}
}

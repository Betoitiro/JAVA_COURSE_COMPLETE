package Lambda;

public class Calculoteste {

	public static void main(String[] args) {
		
		Calculo  calculo = new Somar();
		
		System.out.println(calculo.executar(2, 3));
		
		calculo = new Multiplicar();

		System.out.println(calculo.executar(5, 10));
		
	
	}
}

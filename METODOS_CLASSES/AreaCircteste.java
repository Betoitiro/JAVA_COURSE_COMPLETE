package METODOS_CLASSES;

public class AreaCircteste {
	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(10);
		//a.pi = 10;
		System.out.println(a.area());
		
		AreaCirc a1 = new AreaCirc(5);
		//a1.pi = 5;
		
		System.out.println(a.area());
		
		//AreaCirc.pi = 3.15;
		//a maneira que podemos mudar o valor static da classe, dentro do programa
		//com a definição de pi como constante, não é possivel modificalo. 
		
		System.out.println(a1.area());
		
		System.out.println(a.area()); //dessa forma os resultados irão da diferente, devido a mudança do membro da classe
	}
}


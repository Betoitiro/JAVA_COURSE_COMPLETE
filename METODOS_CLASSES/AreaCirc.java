package METODOS_CLASSES;

public class AreaCirc {
	
	double raio;
	
	static final double pi = 3.14; //o static tornara a instancia pertecente a classe.
	//static final, é um modificador que ira definir a constante da classe
	
	 AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area () {
		return Math.pow(raio, 2) * pi;
		//pow é um metodo static
	}
}

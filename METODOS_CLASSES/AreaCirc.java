package METODOS_CLASSES;

public class AreaCirc {
	
	double raio;
	static double pi = 3.14; //o static tornara a instancia pertecente a classe.
	
	 AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area () {
		return Math.pow(raio, 2) * pi;
		//pow é um metodo static
	}
}

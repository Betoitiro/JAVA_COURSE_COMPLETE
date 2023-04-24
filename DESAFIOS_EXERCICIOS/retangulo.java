package DESAFIOS_EXERCICIOS;

public class retangulo {
	public static void main(String[] args) {
		
		dretangulo r1 = new dretangulo();
		r1.base = 9;
		r1.altura = 5;
		
		System.out.println("a area é = " + r1.area());
		System.out.println("o perimetro é = " + r1.perimetro());
		
		dretangulo r2 = new dretangulo(8.5, 3.3);

		System.out.printf("a area é = %.2f", r2.area());
		System.out.println(); //quebra de linha
		System.out.println("o perimetro é = " + r2.perimetro());
		
	}
}

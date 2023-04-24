package DESAFIOS_EXERCICIOS;

public class dretangulo {
	double base;
	double altura;
	
	dretangulo(){
		
	}
	
	dretangulo(double base1, double altura1){
		this.base = base1;
		this.altura = altura1;
	}
	
	double area() {
		return base * altura;
	}
	
	double perimetro() {
		return (base * 2) + (altura * 2);
	}
}

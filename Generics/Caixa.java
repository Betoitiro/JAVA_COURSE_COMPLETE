package Generics;

public class Caixa <T>{

	//object é o mais generico de objeto
	private T coisa;
	
	//get
	public void gaurdar(T coisa) {
		this.coisa = coisa;
	}
	
	//sett
	public T abrir() {
		return coisa;
	}
} 

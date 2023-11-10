package Generics;

public class CaixaObjeto {
	
	//object é o mais generico de objeto
	private Object 	coisa;
	
	//get
	public void agaurdar(Object coisa) {
		this.coisa = coisa;
	}
	
	//set
	public Object abrir() {
		return coisa;
	}
}

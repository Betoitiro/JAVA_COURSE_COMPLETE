package DESAFIOS;

public class DesafioStatic {
	String produto;
	int setor;
	double preco;
	static final double desconto = 0.25;
	
	DesafioStatic(String np,int nsetor, double pc) {
		produto = np;
		setor = nsetor;
		preco = pc;
	}
	DesafioStatic() {
		
	}
	
	double desconto () {
		return (preco * (1 - desconto));
	}
	
}

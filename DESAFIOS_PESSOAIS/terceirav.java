package DESAFIOS_PESSOAIS;

public class terceirav {
	
	
	String cidade;
	double passagem;
	double hospedagem;
	int dias;
	double compras;
	double multas;
	

	terceirav(String cidade, double passagem, double hospedagem, int dias, double compras, double multas){
		this.cidade = cidade;
		this.hospedagem = hospedagem;
		this.passagem = passagem;
		this.dias = dias;
		this.compras = compras;
		this.multas = multas;
	}
	
	double total(){
		return (dias *180) + hospedagem + passagem + compras + multas;
	}
	
	String intro3() {
		return "A nossa terceira viagem sera para " + cidade + "com o objetivo de passar " + dias + "dias!";
	}
}

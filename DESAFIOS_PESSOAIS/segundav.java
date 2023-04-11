package DESAFIOS_PESSOAIS;

public class segundav {
	
	String cidade;
	double passagem;
	double hospedagem;
	int dias;
	double prejuizo;
	
	segundav(String cidade, double passagem, double hospedagem, int dias, double preju){
		this.cidade = cidade;
		this.passagem = passagem;
		this.hospedagem = hospedagem;
		this.dias = dias;
		this.prejuizo = preju;
	}
	segundav(){
		
	}
	double diariras() {
		return dias * 180;
	}
	double total(){
		return (dias *180) + hospedagem + passagem + prejuizo;
	}
	
	String intro2(){
		return "Ola, a nossa segunda viagem sera em " + cidade + "com o objetivo de passar " + dias + "dias!";
	}
	
}

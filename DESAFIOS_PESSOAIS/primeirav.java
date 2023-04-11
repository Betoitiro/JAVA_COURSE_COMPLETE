package DESAFIOS_PESSOAIS;

public class primeirav {
	
	String cidade;
	double passagem;
	double hospedagem;
	int dias;
	
	primeirav(String cidade, double passagem, double hospedagem, int dias){
		this.cidade = cidade;
		this.passagem = passagem;
		this.hospedagem = hospedagem;
		this.dias = dias;
		
	}
	primeirav (){
		
	}
	
	double diarias() {
		return  dias * 180;
	}
	double total(){
		return (dias *180) + hospedagem + passagem;
	}
	
	String intro() {
		return "Ola, vamos para a nossa primeira viagem, que sera em " + cidade + " e vamos passar " + dias +" dias!";
	}
	
	
	
}

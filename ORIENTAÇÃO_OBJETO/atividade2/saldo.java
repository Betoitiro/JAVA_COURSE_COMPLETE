package ORIENTAÇÃO_OBJETO.atividade2;

import java.util.ArrayList;
import java.util.List;

public class saldo {

	double saldo;
	
	List<numero> n = new ArrayList<>();
	
	saldo(){
		
	}
	saldo(double saldo){
		this.saldo = saldo;
	}
	void depostar(double valor) {
		saldo +=valor;
	}
	

	void sacar(double valor) {
		if(saldo < valor) {
			System.out.println("Saldo insuficiente");
		}else {
			saldo -=valor;
		}
	}
	
	void exibirSaldo() {
		System.out.println("o saldo da conta é de " + saldo);
	
	
	}

	
	
	
}

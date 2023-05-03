package ORIENTAÇÃO_OBJETO.atividade2;

public class Conta {

	public static void main(String[] args) {
		
		titular t = new titular("Helton");
		numero n = new numero(8);
		saldo s = new saldo(1500);
		
		s.depostar(1000);
		s.sacar(250.36);
		s.sacar(5000); //caso o valor desejado a ser sacado o sistema apresentara como saldo insuficiente 
		
		System.out.println("O saldo do titular " + t.titular + " do digito " + n.numero + " é de " + s.saldo);
		
		s.exibirSaldo();
	}
}

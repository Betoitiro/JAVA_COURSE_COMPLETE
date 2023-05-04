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
		
		titular t2 = new titular("Remerson");
		//numero n2 = new numero(2);
		saldo s2 = new saldo(2500);
		
		s2.depostar(1500);
		System.out.println();
		
		System.out.println("Seja bem vindo " + t2.titular + "! Possui um saldo de " + s2.saldo);
		
		titular t3 = new titular("joão Pedro");
		numero n3 = new numero(6);
		saldo s3 = new saldo(2500);
		
		System.out.println();//quebra d elinha 
		s3.depostar(5000);
	
		
		System.out.println("O saldo do titular " + t3.titular + " responsavel pelo numero " + n3.numero
				+ " é de R$" + s3.saldo);
	
	}
}

package ORIENTAÇÃO_OBJETO.encapsulamentoCasaA;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setNome("humberto");
		p1.setSobrenome("itiro morimitsu");
		p1.setIdade(20);
		System.out.println("meu nome é " + p1.getNome() + " "  + p1.getSobrenome()+ " e tenho " + p1.getIdade() + " anos de idade");
		
		Pessoa p2  = new Pessoa("Humberto","itiro Morimitsu", 18);
		
		System.out.println("meu primeiro nome é " + p2.getNome() + ", meu segundo nome é " + p2.getSobrenome() + " e tenho " + p2.getIdade() + " anos!");
		
	}
}

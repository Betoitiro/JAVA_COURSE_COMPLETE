package ORIENTAÇÃO_OBJETO.encapsulamentoCasaA;

public class Pessoa {

	String nome;
	String sobrenome;
	private int idade;
	
	Pessoa(){
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}

	Pessoa(String nome, String sobrenome, int idade){
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}


	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}

	


	public String getSobrenome() {
		return sobrenome;
	}




	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}




	public int getIdade() {
		return idade;
	}
	
	//função get, funciona como uma leitura daquilo que ele é aplicado
	
//	public int leridade() {
//		return idade;
//	}
	
	//funão set, serve para alterar a idade que foi definida no programa
	
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade>0 && novaIdade <=120) {
			this.idade = novaIdade;
		}
	}
	
	
	
	

		
	
}

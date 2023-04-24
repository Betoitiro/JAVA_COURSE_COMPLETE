package DESAFIOS_EXERCICIOS;

import java.time.LocalDate;

public class dfuncionario {

	String nome;
	double salario;
	LocalDate admissao;
	
	dfuncionario(){
		
	}
	
	dfuncionario(String nome1, double salario1, LocalDate admissão1){
		this.nome = nome1;
		this.salario = salario1;
		this.admissao = admissão1;
	}
	
	
	int calcularts() {
		LocalDate dataAtual = LocalDate.now();
		int anos = dataAtual.getYear() - admissao.getYear();
	    int meses = dataAtual.getMonthValue() - admissao.getMonthValue();
		if (meses < 0) {
			anos --;
			meses +=12;
		}
		return anos;
		
	}
	public double sa(double bonus) {
		return (salario * 13) + bonus;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public LocalDate getadmissao() {
		return admissao;
	}
	
	public void setadmissao(LocalDate admissao) {
		this.admissao = admissao;
	}
}

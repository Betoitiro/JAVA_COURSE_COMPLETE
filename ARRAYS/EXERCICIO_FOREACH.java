package ARRAYS;

public class EXERCICIO_FOREACH {
	public static void main(String[] args) {
		//esse script corresponde ao exercicio feito usando um loop for convencional
		//o intuito desse é por o mesmo exercicio usando foreach
		
		double [] notasAlunon = new double [3];
	
		notasAlunon [0] = 8.0;
		notasAlunon [1] = 9.7;
		notasAlunon [2] = 8.6;
		
		double totalaln = 0;
		for ( double nota :notasAlunon) {
			totalaln += nota;
		}
		System.out.println(totalaln); //total das notas
		
		double media = totalaln/3;
		
		System.out.printf("a media do aluno é de: %.2f" , media);
		
		System.out.println(); //quebra de linha
		
		if (media < 7){
			System.out.println("o aluno foi aprovado");
		}
		else {
			System.out.println("o aluno foi reprovado!");
		}
	}
	
}

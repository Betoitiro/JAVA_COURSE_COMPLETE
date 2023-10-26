package Steam_API.Reduce02;

public class Media {

	private double total;
	private int quantidade;
	
	//metodo para somar o total de pontos e a quantidade de n
	public Media add(double valor) {
		total += valor;
		quantidade++;
		//colocando o return e o media o nome da class no metodo, é possivel colocar as chamadas na mesma linha do m1
		return this;
		
	}
	
	//metodo para pegar a media
	public double getValor() {
		/*
		double media =  total/quantidade;
		
		if(media>7) {
			System.out.println("O aluno esta aprovado pela media!! \nSua media foi de " + media);
		}else {
			System.out.println("O aluno não atingiu a media necessaria!! \nSua media foi de "+ media);
		}
		return media;
		*/
		return total/quantidade;
	}
	
	public static Media combinar(Media m1, Media m2) {
		Media resultante = new Media();
		resultante.total = m1.total + m2.total;
		resultante.quantidade = m1.quantidade + m2.quantidade;
		return resultante;
	}
}

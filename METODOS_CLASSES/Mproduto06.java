package METODOS_CLASSES;

public class Mproduto06 {
	public static void main(String[] args) {
		
		Mproduto05 m1 =new Mproduto05();
		
		m1.nome ="Mercedes";
		m1.preco = 250.000;
		m1.desconto = 0.25;

		
		
		double pcd = m1.precoDesconto(); //para chamar um metodo, em que 
										//colocar os parenteses
		System.out.println("a sua mercedes saira com o desconto"
				+ " de 25%, o valor total é de " + pcd);
		
		//se o sistema necessitar de um desconto do gerente, é so usar o seguinte codigo
		
		double dcg = m1.precoDesconto(0.1);
		System.out.printf("Hoje é seu dia de sorte, o gerente lhe concedeu um desconto adicional e seu veiculo "
				+ "fiou por R$%.2f", dcg);
		
	}
}

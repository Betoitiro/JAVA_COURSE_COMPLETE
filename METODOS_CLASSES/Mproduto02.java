package METODOS_CLASSES;

public class Mproduto02 {
	public static void main(String[] args) {
		
		Mproduto m1 =new Mproduto();
		
		m1.nome ="Mercedes";
		m1.preco = 250.000;
		m1.desconto = 0.25;
		
		double pcd = m1.precoDesconto();
		System.out.println(pcd);
	}
}

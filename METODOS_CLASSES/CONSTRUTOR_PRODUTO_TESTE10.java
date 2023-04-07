package METODOS_CLASSES;

public class CONSTRUTOR_PRODUTO_TESTE10 {
	public static void main(String[] args) {
		
		
		CONSTRUTOR_PRODUTO09 c1 = new CONSTRUTOR_PRODUTO09("celular", 4888,0.3);
		//c1.nome = "celular";
		//c1.preco = 4000.00;
		//c1.desconto = 0.30;
		
		var c2 = new CONSTRUTOR_PRODUTO09("icer nitro 5", 4899,0.3);
		//c2.desconto = 0.3;
		

		System.out.println(c1);
		System.out.println(c2);
	}
}

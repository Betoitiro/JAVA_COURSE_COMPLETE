package OO.abstract1;

public class GatoTeste {

	public static void main(String[] args) {
		
			Animal a1 = new Gato(); //no conseito abstrato, as classes que são não ´pde, ser estanciadas
			
			System.out.println(a1.Mover());
			System.out.println(a1.Mamar());
			System.out.println(a1.Respirar());
			System.out.println(a1.Brigar());
			System.out.println(a1.miar());
	}
	

}


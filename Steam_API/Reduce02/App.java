package Steam_API.Reduce02;

public class App {

	public static void main(String[] args) {
		
		Media m1 = new Media().add(8.5).add(9.6).add(5.0);
		Media m2 = new Media().add(6.5).add(9.6).add(5.0);;

		m1.getValor();
		m2.getValor();
		
		System.out.println(Media.combinar(m1, m2).getValor());

		

	}
}

package ORIENTAÇÃO_OBJETO.Atividade1;

public class Pessoa {

	public static void main(String[] args) {
			
		nome n = new nome("humberto");
		n.addidade(17);
		
		idade id = new idade();
		id.idade = 17;
		
		sexo s = new sexo();
		s.sexo = "Mascolino";
		
		System.out.println("Meu nome é " + n.nome + " e tenho " + id.idade + " anos!");
		System.out.println("Meu sexo é " + s.sexo);
		
		nome n1 = new nome ("Rmerson");
		idade id1 = new idade(24);
		sexo s1 = new sexo("Mascolino");
		
		System.out.println();
		
		System.out.println("O nome dele é " + n1.nome +" Tem "+ id1.idade + "de idade e se indentifica como " + s1.sexo +"!" );
	
		
		
	}
}

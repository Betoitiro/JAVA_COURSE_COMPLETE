package EQUALSHASHCODE;

public class USUARIO {
	
	String nome;
	String email;
	
//	@Override
//	public boolean equals(Object obj) {
//		
//		if(obj instanceof USUARIO) {
//		
//		USUARIO outro = (USUARIO) obj;
//		
//		return super.equals(obj);
//		
//		}else {
//		return false;
//		}
//	}
	public boolean equals(Object obj) {
		
		if(obj instanceof USUARIO) {
		
		USUARIO outro = (USUARIO) obj;
		boolean nomeIgual = outro.nome.equals(this.nome);
		boolean emailIgual = outro.email.equals(this.email);
		
		return nomeIgual && emailIgual;
		}else {
			return false;
		}
	}
		//o hashcode sera utilizado na proxima aula
	
}

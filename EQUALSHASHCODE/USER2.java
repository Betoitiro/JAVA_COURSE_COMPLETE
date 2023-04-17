package EQUALSHASHCODE;

import java.util.Objects;

public class USER2 {
	
	String nome;
	String email;
	int idade;
	
	@Override
	public int hashCode() {
		return Objects.hash(email, idade, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		USER2 other = (USER2) obj;
		return Objects.equals(email, other.email) && idade == other.idade && Objects.equals(nome, other.nome);
	}
}

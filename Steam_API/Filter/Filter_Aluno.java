package Steam_API.Filter;

import java.util.Objects;

public class Filter_Aluno {
    
    public final String nome;
    public final double nota;
    //como são finais/ constante, não precisa colocar o get and set
    
    public Filter_Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
    
    public String toString() {
    	return nome + " tem nota " + nota;
    	
    }

	@Override
	public int hashCode() {
		return Objects.hash(nome, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filter_Aluno other = (Filter_Aluno) obj;
		return Objects.equals(nome, other.nome) && Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
    
    
}

package ORIENTAÇÃO_OBJETO.atividade2;

import java.util.ArrayList;
import java.util.List;

public class titular {

	String titular;
	
	List<saldo> saldo = new ArrayList<>();
	
	titular(){
		
	}
	titular(String titular){
		this.titular = titular;
	}
}
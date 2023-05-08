package ORIENTAÇÃO_OBJETO.herança1;

public class jogador {

	int life;
	int x;
	int y;
	
	jogador(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	boolean atacar(jogador oponente) {
		 int deltax = Math.abs(x- oponente.x);
		 int deltay = Math.abs(y-oponente.y);
		 
		 if(deltax ==0 && deltay ==1) {
			 oponente.life -= 10;
		 }else if(deltax ==1 && deltay ==0) {
			 oponente.life -=10;
		 }else {
			 return false;
		 }
		 
		 return true;
	}
	

	
	boolean andar(Direcao direcao) {
		switch(direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case OESTE:
			x--;
			break;
		case SUL:
			y++;
			break;
		default:
			break;
			
		}
		return true;
	}		
}

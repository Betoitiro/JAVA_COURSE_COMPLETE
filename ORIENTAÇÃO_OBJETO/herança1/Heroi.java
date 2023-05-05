package ORIENTAÇÃO_OBJETO.herança1;

public class Heroi extends jogador {

	boolean atacar(jogador oponente) {
		 int deltax = Math.abs(x- oponente.x);
		 int deltay = Math.abs(y-oponente.y);
		 
		 if(deltax ==0 && deltay ==1) {
			 oponente.life -= 20;
		 }else if(deltax ==1 && deltay ==0) {
			 oponente.life -=20;
		 }else {
			 return false;
		 }
		 
		 return true;
	}
}

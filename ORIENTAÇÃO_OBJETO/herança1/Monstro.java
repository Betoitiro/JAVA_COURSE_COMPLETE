package ORIENTAÇÃO_OBJETO.herança1;

public class Monstro extends jogador {
	
	public Monstro(int x, int y){
		super(1, 1);
	}
	
	public boolean atacar(jogador oponente) {
		 int deltax = Math.abs(x- oponente.x);
		 int deltay = Math.abs(y-oponente.y);
		 
		 if(deltax ==0 && deltay ==1) {
			 oponente.life -= 15;
		 }else if(deltax ==1 && deltay ==0) {
			 oponente.life -=10;
		 }else {
			 return false;
		 }
		 
		 return true;
	}
	
	

	
}

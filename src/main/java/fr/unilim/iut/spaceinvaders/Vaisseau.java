package fr.unilim.iut.spaceinvaders;

public class Vaisseau {

	int x;
	int y;
	int longueur;
	int hauteur;



	public Vaisseau(int longueur, int hauteur, int x2, int y2) {
		this.longueur=longueur;
		this.hauteur=hauteur;
		this.x = x;
		this.y = y;

	}
	public int abscisse() {
		return x;
	}
	
	public int ordonnee() {
		return y;
	}
	
	public boolean occupeLaPosition(int x, int y) {
		if ((this.x<=x) && (x<=this.x+this.longueur-1)) 
		      if ((this.y-this.hauteur+1<=y) && (y<=this.y))
			  return true;
		
	     return false;
	}

	public void seDeplacerVersLaDroite() {
		this.x = this.x + 1 ;
	}
	public void seDeplacerVersLaGauche() {
		this.x = this.x - 1 ;

	}

}




package fr.unilim.iut.spaceinvaders;

public class Vaisseau {


	int x;
	int y;
	int longueur;
	int hauteur;

	public Vaisseau(int longuer, int hauteur) {
		this(longuer , hauteur , 0 ,0 );
	}

	public Vaisseau(int longueur, int hauteur, int x, int y) {
		this.longueur=longueur;
		this.hauteur=hauteur;
		this.x = x;
		this.y = y;
	}

	public boolean occupeLaPosition(int x, int y) {
		return (estAbscisseCouverte(x) && estOrdonneeCouverte(y));
	}

	private boolean estOrdonneeCouverte(int y) {
		return (ordonnerLaPlusBasse()<=y) && (y<=ordonnerLaPlusHaute());
	}

	private int ordonnerLaPlusHaute() {
		return this.y;
	}

	private int ordonnerLaPlusBasse() {
		return ordonnerLaPlusHaute()-this.hauteur+1;
	}

	private boolean estAbscisseCouverte(int x) {
		return (abscisseLaPlusAGauche()<=x) && (x<=abscisseLaPlusADroite());
	}

	public int abscisseLaPlusADroite() {
		return this.x+this.longueur-1;
	}

	public void seDeplacerVersLaDroite() {
		this.x = this.x + 1 ;
	}

	public int abscisseLaPlusAGauche() {
		return this.x;
	}

	public int ordonnee() {
		return y;
	}

	public void seDeplacerVersLaGauche() {
		this.x = this.x - 1 ;

	}

	public void positionner(int x, int y) {
		this.x=x;
		this.y=y;

	}
}




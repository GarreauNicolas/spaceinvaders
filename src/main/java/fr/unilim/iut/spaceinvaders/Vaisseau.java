package fr.unilim.iut.spaceinvaders;

public class Vaisseau {

	Position origine;
	Dimension dimension;


	//Constructeur

	public Vaisseau(int longueur, int hauteur) {
		this(longueur, hauteur, 0, 0);

	}

	public Vaisseau(int longueur, int hauteur, int x, int y) {
		this(new Dimension(longueur, hauteur), new Position(x, y));

	}

	public Vaisseau(Dimension dimension, Position positionOrigine) {
		this.dimension = dimension;
		this.origine = positionOrigine;
	}
	//position

	public boolean occupeLaPosition(int x, int y) {

		return (estAbscisseCouverte(x) && estOrdonneeCouverte(y));
	}


	//ordonner

	private boolean estOrdonneeCouverte(int y) {
		return (ordonnerLaPlusBasse()<=y) && (y<=ordonnerLaPlusHaute());
	}

	private int ordonnerLaPlusHaute() {
		return this.origine.ordonnee();
	}

	private int ordonnerLaPlusBasse() {
		return ordonnerLaPlusHaute()-this.dimension.hauteur()+1;
	}

	//abscisse


	private boolean estAbscisseCouverte(int x) {
		return (abscisseLaPlusAGauche()<=x) && (x<=abscisseLaPlusADroite());
	}

	public int abscisseLaPlusAGauche() {
		return this.origine.abscisse();
	}

	public int abscisseLaPlusADroite() {
		return this.origine.abscisse()+this.dimension.longueur()-1;
	}

	//deplacer

	public void seDeplacerVersLaGauche() {
		this.origine.changerAbscisse(this.origine.abscisse()-1);

	}

	public void seDeplacerVersLaDroite() {
		this.origine.changerAbscisse(this.origine.abscisse()+1);
	}

	//positionner
	public void positionner(int x, int y) {
		this.origine.changerAbscisse(x);
		this.origine.changerOrdonnee(y);

	}

}




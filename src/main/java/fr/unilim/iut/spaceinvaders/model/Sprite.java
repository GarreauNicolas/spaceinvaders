package fr.unilim.iut.spaceinvaders.model;

public abstract class Sprite {

	protected Position origine;
	protected Dimension dimension;
	protected int vitesse;

	//Constructeur 

	public Sprite(Dimension dimension, Position origine, int vitesse) {
		super();
		this.dimension = dimension;
		this.origine = origine;
		this.vitesse = vitesse;
	}

	//Position
	public boolean occupeLaPosition(int x, int y) {
		return (estAbscisseCouverte(x) && estOrdonneeCouverte(y));
	}

	private boolean estOrdonneeCouverte(int y) {
		return (ordonneeLaPlusBasse()<=y) && (y<=ordonneeLaPlusHaute());
	}

	public int ordonneeLaPlusHaute() {
		return this.origine.ordonnee();
	}

	public int ordonneeLaPlusBasse() {
		return ordonneeLaPlusHaute()-this.dimension.hauteur()+1;
	}

	private boolean estAbscisseCouverte(int x) {
		return (abscisseLaPlusAGauche()<=x) && (x<=abscisseLaPlusADroite());
	}

	public int abscisseLaPlusAGauche() {
		return this.origine.abscisse();
	}

	public int abscisseLaPlusADroite() {
		return this.origine.abscisse()+this.dimension.longueur()-1;
	}

	public void positionner(int x, int y) {
		this.origine.changerAbscisse(x);
		this.origine.changerOrdonnee(y);

	}
	
	public Position position() {
		return origine;
	}

	//Deplacement

	public void deplacerVersLeHaut() {
		this.origine.changerOrdonnee(this.origine.ordonnee() - vitesse);
	}

	public void deplacerHorizontalementVers(Direction direction) {
		this.origine.changerAbscisse(this.origine.abscisse() + direction.valeur()*vitesse);
	}

	public void deplacerVerticalementVers(Direction direction) {
		this.origine.changerOrdonnee(this.origine.ordonnee() + direction.valeur()*vitesse);
	}

	//dimension

	public int longueur() {
		return dimension.longueur();
	}

	public int hauteur() {
		return dimension.hauteur();
	}
	
	//cordonner des sprite
	
	public int coindroit() {
		return this.origine.abscisse();
		
	}
	public int coingauche() {
		return this.origine.abscisse()-this.longueur();
	}
	
	public int positionHaute() {
		return this.origine.ordonnee();
	}

	//enumeration

	public enum Direction {

		HAUT (1),
		BAS (-1),
		GAUCHE (-1),
		DROITE (1),

		HAUT_ECRAN(-1),
		BAS_ECRAN(1);

		private int valeur;

		private Direction(int valeur) {
			this.valeur = valeur;
		}

		public int valeur() {
			return this.valeur;
		}

	}

}
package fr.unilim.iut.spaceinvaders;

public class Vaisseau {


	int x;
	int y;
	int longueur;
	int hauteur;


	public Vaisseau(int longueur, int hauteur) {
		this(longueur, hauteur, 0, 0);
	}


	public Vaisseau(int longueur, int hauteur, int x, int y) {
		this.longueur=longueur;
		this.hauteur=hauteur;
		this.x = x;
		this.y = y;
	}

	public boolean occupeLaPosition(int x, int y) {

		if (estAbscisseCouverte(x)) 
			if (estOrdonneeCouverte(y))
				return true;

		return (estAbscisseCouverte(x) && estOrdonneeCouverte(y));
	}


	
	
	//verif abscisses
	
	private boolean estAbscisseCouverte(int x) {
		return (abscisseLaPlusAGauche()<=x) && (x<=abscisseLaPlusADroite());
	}

	public int abscisseLaPlusAGauche() {
		return this.x;
	}

	public int abscisseLaPlusADroite() {
		return this.x+this.longueur-1;
	}
	
	//verif ordonnes

	private int ordonneLaPlusBasse() {
		return this.y-this.hauteur+1;
	}
	
	public int ordonneLaPlusHaute() {
		return this.y;
	}
	
	private boolean estOrdonneeCouverte(int y) {
		return ordonneLaPlusBasse()<=y && y<=ordonneLaPlusHaute();
	}
	
	// deplacer le vaisseau
	
	public void seDeplacerVersLaDroite() {
		this.x = this.x + 1 ;
	}

	public void seDeplacerVersLaGauche() {
		this.x = this.x - 1 ;

	}


	public void positionner(int x, int y) {
		this.x=x;
		this.y=y;

	}

}




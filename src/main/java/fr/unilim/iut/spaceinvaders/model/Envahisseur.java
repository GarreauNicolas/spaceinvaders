package fr.unilim.iut.spaceinvaders.model;

public class Envahisseur extends Sprite{

	public Envahisseur(Dimension dimension, Position positionOrigine, int vitesse) {
		super(dimension, positionOrigine, vitesse);
		
	}

	public int ordonneeLaPlusHaute() {
		return this.origine.ordonnee();
	}
	
	public int ordonneeLaPlusBasse() {
		return ordonneeLaPlusHaute()-this.dimension.hauteur()+1;
	}
}

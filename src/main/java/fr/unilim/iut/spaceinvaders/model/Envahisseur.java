package fr.unilim.iut.spaceinvaders.model;

public class Envahisseur extends Sprite{
	
	public boolean sens;

	public Envahisseur(Dimension dimension, Position positionOrigine, int vitesse) {
		super(dimension, positionOrigine, vitesse);
		this.sens=true;
		
	}
	
	public boolean sens() {
		return sens;
	}
	
	public void nouveauSens(boolean sens) {
		this.sens=sens;
	}
}
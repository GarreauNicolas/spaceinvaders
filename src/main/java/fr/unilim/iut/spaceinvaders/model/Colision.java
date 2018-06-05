package fr.unilim.iut.spaceinvaders.model;

public class Colision {
	
	private Envahisseur envahisseur;
	private Missile missile;
	
	
	public boolean destruction(Envahisseur envahisseur,Missile missile) {
		if(missile.coindroit()<=envahisseur.coindroit() || missile.coingauche()>=envahisseur.coingauche()) {
			if(missile.positionHaute()==envahisseur.positionHaute()) {
				return true;
			}
		}
		return false;
	}

}

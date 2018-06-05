package fr.unilim.iut.spaceinvaders.model;

public class Colision {
	
	private Envahisseur envahisseur;
	private Missile missile;
	
	public void destruction() {
		if(this.missile.coindroit()<=this.envahisseur.coindroit() && this.missile.coingauche()>=this.envahisseur.coingauche()) {
			if(this.missile.ordonneeLaPlusBasse()==this.envahisseur.ordonneeLaPlusHaute()) {
				this.missile=null;
				this.envahisseur=null;
			}
		}
	}

}

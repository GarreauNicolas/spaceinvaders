package fr.unilim.iut.spaceinvaders;

public class SpaceInvaders {

	int longueur;
	int hauteur;

	public SpaceInvaders(int longueur, int hauteur) {
		this.longueur = longueur;
		this.hauteur = hauteur;
	}
	
	  @Override
	    public String toString() {
	        String espaceDeJeux = "";
	        for (int i = 0; i < hauteur; i++) {
	            for (int j = 0; j < longueur; j++) {
	                espaceDeJeux += ".";
	            }
	            espaceDeJeux += "\n";
	        }
	        return espaceDeJeux;
	    }
}
package fr.unilim.iut.spaceinvaders;

import fr.unilim.iut.spaceinvaders.utils.HorsEspaceJeuException;

public class SpaceInvaders {

	private static final char MARQUE_FIN_DE_LIGNE = '\n';
	private static final char MARQUE_VIDE = '.';
	private static final char MARQUE_VAISSEAU = 'V';
	int x;
	int y;
	Vaisseau vaisseau;

	public SpaceInvaders(int longueur, int hauteur) {
		this.x = longueur;
		this.y = hauteur;
	}

	@Override
	public String toString() {
		return recupererEspaceJeuDansChaineASCII();
	}


	public String recupererEspaceJeuDansChaineASCII() {
		StringBuilder espaceDeJeu = new StringBuilder();
		for (int y = 0; y < this.y; y++) {
			for (int x = 0; x < this.x; x++) {
				espaceDeJeu.append(recupererMarqueDeLaPosition(x, y));
			}
			espaceDeJeu.append(MARQUE_FIN_DE_LIGNE);
		}
		return espaceDeJeu.toString();
	}

	private char recupererMarqueDeLaPosition(int x, int y) {
		char marque;
		if (this.aUnVaisseauQuiOccupeLaPosition(x, y))
			marque=MARQUE_VAISSEAU;
		else
			marque=MARQUE_VIDE;
		return marque;
	}

	private boolean aUnVaisseauQuiOccupeLaPosition(int x, int y) {
		return this.aUnVaisseau() && vaisseau.occupeLaPosition(x, y);
	}

	private boolean aUnVaisseau() {
		return vaisseau!=null;
	}


	public void positionnerUnNouveauVaisseau(int x, int y) {

		if (  !estDansEspaceJeu(x, y) )

			throw new HorsEspaceJeuException("Vous êtes en dehors de l'espace jeu");

			throw new HorsEspaceJeuException("La position du vaisseau est en dehors de l'espace jeu");

			vaisseau = new Vaisseau(x, y); 

	}

	private boolean estDansEspaceJeu(int x, int y) {
		return ((x >= 0) && (x < this.x)) && ((y >= 0) && (y < this.y));
	}

	public void deplacerVaisseauVersLaDroite() {

        if (vaisseau.getX()< (this.x-1)) vaisseau.seDeplacerVersLaDroite();
	}
	
	public int getX() {
        return this.x;
	}


}







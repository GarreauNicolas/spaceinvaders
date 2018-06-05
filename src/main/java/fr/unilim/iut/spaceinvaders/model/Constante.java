package fr.unilim.iut.spaceinvaders.model;

public class Constante {

	public static final int ESPACEJEU_LONGUEUR = 600;
	public static final int ESPACEJEU_HAUTEUR = 400;

	public static final int VAISSEAU_LONGUEUR = 40;
	public static final int VAISSEAU_HAUTEUR = 20;
	public static final int VAISSEAU_VITESSE = 10;
	
	public static final int ENVAHISSEUR_LONGUEUR = 40;
	public static final int ENVAHISSEUR_HAUTEUR = 30;
	public static final int ENVAHISSEUR_VITESSE = 5;
	
	public static final int MISSILE_LONGUEUR = 5;
	public static final int MISSILE_HAUTEUR = 10;
	public static final int MISSILE_VITESSE = 20;

	public static final char MARQUE_FIN_LIGNE = '\n';
	public static final char MARQUE_VIDE = '.';
	public static final char MARQUE_VAISSEAU = 'V';
	public static final char MARQUE_MISSILE = 'M';
	public static final char MARQUE_FIN_DE_LIGNE = '\n';
	public static final char MARQUE_INVADERS='D';
	
	public static final Dimension DIMENSION_VAISSEAU_DEBUT= new Dimension(VAISSEAU_LONGUEUR,VAISSEAU_HAUTEUR);
	public static final Position POSITION_VAISSEAU_DEBUT=new Position(ESPACEJEU_LONGUEUR/2,ESPACEJEU_HAUTEUR-1);
	
	public static final Dimension DIMENSION_ENVAHISSEUR_DEBUT= new Dimension(ENVAHISSEUR_LONGUEUR,ENVAHISSEUR_HAUTEUR);
	public static final Position POSITION_ENVAHISSSEUR_DEBUT=new Position(ESPACEJEU_LONGUEUR/2,100);
	
	public static final Dimension DIMENSION_MISSILE= new Dimension(MISSILE_LONGUEUR, MISSILE_HAUTEUR);

	
}

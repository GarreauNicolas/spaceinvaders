package fr.unilim.iut.spaceinvaders.main;


import fr.unilim.iut.spaceinvaders.model.SpaceInvaders;
import fr.unilim.iut.spaceinvaders.moteurjeu.DessinSpaceInvaders;
import fr.unilim.iut.spaceinvaders.moteurjeu.MoteurGraphique;
import fr.unilim.iut.spaceinvaders.model.Constante;

public class Main {

    public static void main(String[] args) throws InterruptedException {

	    SpaceInvaders jeu = new SpaceInvaders(Constante.ESPACEJEU_LONGUEUR, Constante.ESPACEJEU_HAUTEUR);
	    jeu.initialiser();
	    DessinSpaceInvaders afficheur = new DessinSpaceInvaders(jeu);
	    MoteurGraphique moteur = new MoteurGraphique(jeu, afficheur);
	    moteur.lancerJeu(Constante.ESPACEJEU_LONGUEUR, Constante.ESPACEJEU_HAUTEUR);
    }

}

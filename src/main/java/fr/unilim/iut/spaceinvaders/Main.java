package fr.unilim.iut.spaceinvaders;

import fr.unilim.iut.spaceinvaders.moteurjeu.MoteurGraphique;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		SpaceInvaders jeu = new SpaceInvaders(Constante.ECRAN.longueur(), Constante.ECRAN.hauteur());
		jeu.initialiserJeu();
		DessinSpaceInvaders afficheur = new DessinSpaceInvaders(jeu);

		MoteurGraphique moteur = new MoteurGraphique(jeu, afficheur);
		moteur.lancerJeu(Constante.ECRAN.longueur(), Constante.ECRAN.hauteur());
	}

}
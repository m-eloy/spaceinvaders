package fr.unilim.iut.spaceinvaders;

import fr.unilim.iut.spaceinvaders.moteurjeu.MoteurGraphique;
import fr.unilim.iut.spaceinvaders.model.Constante;
import fr.unilim.iut.spaceinvaders.model.DessinSpaceInvaders;
import fr.unilim.iut.spaceinvaders.model.SpaceInvaders;

public class Main {
	public static void main(String[] args) {
		SpaceInvaders spaceInvaders = new SpaceInvaders(Constante.ECRAN.longueur(), Constante.ECRAN.hauteur());
		DessinSpaceInvaders dessinSpaceinvaders = new DessinSpaceInvaders(spaceInvaders);
		
		spaceInvaders.initialiser();
		
		MoteurGraphique moteurGraphique = new MoteurGraphique(spaceInvaders, dessinSpaceinvaders);
		try {
			moteurGraphique.lancerJeu(Constante.ECRAN.longueur(), Constante.ECRAN.hauteur());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
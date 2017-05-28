package fr.unilim.iut.spaceinvaders.model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import fr.unilim.iut.spaceinvaders.moteurjeu.DessinJeu;

public class DessinSpaceInvaders implements DessinJeu {

	SpaceInvaders spaceInvaders;

	public DessinSpaceInvaders(SpaceInvaders spaceInvaders) {
		this.spaceInvaders = spaceInvaders;
	}

	public void dessiner(BufferedImage image) {
		Graphics2D g = (Graphics2D) image.getGraphics();
		
		int positionVaisseauX = spaceInvaders.recupererVaisseau().abscisse();
		int positionVaisseauY = spaceInvaders.recupererVaisseau().ordonnee() - Constante.VAISSEAU.hauteur();
		
		g.setColor(Color.GRAY);
		g.fillRect(positionVaisseauX, positionVaisseauY, Constante.VAISSEAU.longueur(), Constante.VAISSEAU.hauteur());

		
		if(spaceInvaders.aUnMissile()) {
			int positionMissileX = spaceInvaders.recupererMissile().abscisse();
			int positionMissileY = spaceInvaders.recupererMissile().ordonnee() - Constante.MISSILE.hauteur();
			
			g.setColor(Color.BLUE);
			g.fillRect(positionMissileX, positionMissileY, Constante.MISSILE.longueur(), Constante.MISSILE.hauteur());
		}
	}

}
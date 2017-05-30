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
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Constante.ECRAN.longueur(), Constante.ECRAN.hauteur());
		
		int positionVaisseauX = spaceInvaders.getVaisseau().abscisse();
		int positionVaisseauY = spaceInvaders.getVaisseau().ordonnee() - Constante.VAISSEAU.hauteur();
		
		g.setColor(Color.BLUE);
		g.fillRect(positionVaisseauX, positionVaisseauY, Constante.VAISSEAU.longueur(), Constante.VAISSEAU.hauteur());
		
		int positionEnvahisseurX = spaceInvaders.getEnvahisseur().abscisse();
		int positionEnvahisseurY = spaceInvaders.getEnvahisseur().ordonnee() - Constante.ENVAHISSEUR.hauteur();
		
		g.setColor(Color.RED);
		g.fillRect(positionEnvahisseurX, positionEnvahisseurY, Constante.ENVAHISSEUR.longueur(), Constante.ENVAHISSEUR.hauteur());
		
		
		if(spaceInvaders.aUnMissile()) {
			int positionMissileX = spaceInvaders.getMissile().abscisse();
			int positionMissileY = spaceInvaders.getMissile().ordonnee() - Constante.MISSILE.hauteur();
			
			g.setColor(Color.PINK);
			g.fillRect(positionMissileX, positionMissileY, Constante.MISSILE.longueur(), Constante.MISSILE.hauteur());
		}
	}
}
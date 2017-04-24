package presentation;

import metier.Canard;
import metier.CanardPlastique;
import metier.Coincoin;
import metier.Colvert;
import metier.Leurre;
import metier.VolerAvecDesAiles;

public class Lanceur {

	public static void main(String[] args) {
		Canard c1 = new Colvert();
		c1.afficher();
		c1.effectuerCancan();
		c1.effectuerVol();
		c1.nager();
		
		System.out.println("----------------------------------------");
		
		Canard c2 = new CanardPlastique();
		c2.afficher();
		c2.effectuerCancan();
		c2.effectuerVol();
		c2.nager();
		
		System.out.println("----------------------------------------");
		
		Canard c3 = new Leurre();
		c3.afficher();
		c3.effectuerCancan();
		c3.effectuerVol();
		c3.nager();

		//avantage : changement de comportement facile
		c3.setComportementCancan(new Coincoin());
		c3.setComportementVol(new VolerAvecDesAiles());
		System.out.println("----------------------------------------");
		c3.afficher();
		c3.effectuerCancan();
		c3.effectuerVol();
		c3.nager();


	}

}

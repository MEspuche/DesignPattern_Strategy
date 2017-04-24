package metier;

public class Colvert extends Canard {

	
	
	public Colvert() {
		super();
		comportementVol = new VolerAvecDesAiles();
		comportementCancan = new Cancan();
	}

	@Override
	public void afficher() {
		System.out.println("je suis un colvert");
	}
	
	

}

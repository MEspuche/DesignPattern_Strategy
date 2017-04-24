package metier;

public class CanardPlastique extends Canard {

	
	
	public CanardPlastique() {
		super();
		comportementCancan = new Coincoin();
		comportementVol = new NePasVoler();
	}

	@Override
	public void afficher() {
		System.out.println("je suis un canard en plastique");
		
	}

}

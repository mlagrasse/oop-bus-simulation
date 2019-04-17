package tec;

public class Tetu extends PassagerAbstrait {

	public Tetu(String nom, int destination, PassagerArret p) {
		super(nom, destination, p);
	}

    @Override
    protected void choixPlaceMontee(VehiculeMontee v) {
        v.monteeDemanderDebout(this);
    }
    
}
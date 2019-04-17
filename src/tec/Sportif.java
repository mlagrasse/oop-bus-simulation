package tec;

public class Sportif extends PassagerAbstrait {

	public Sportif(String nom, int destination, PassagerArret p) {
		super(nom, destination, p);
	}

    @Override
    protected void choixPlaceMontee(VehiculeMontee v) {
        if (v.aPlaceDebout()) 
            v.monteeDemanderDebout(this);
    }
    
}
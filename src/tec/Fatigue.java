package tec;

public class Fatigue extends PassagerAbstrait {

	public Fatigue(String nom, int destination, PassagerArret p) {
		super(nom, destination, p);
	}

    @Override
    protected void choixPlaceMontee(VehiculeMontee v) {
        if (v.aPlaceAssise()) 
            v.monteeDemanderAssis(this);
    }
    
}
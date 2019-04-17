package tec;

public class Repos extends PassagerAbstrait {

	public Repos(String nom, int destination, PassagerArret p) {
		super(nom, destination, p);
	}

    @Override
    protected void choixPlaceMontee(VehiculeMontee v) {
        if (v.aPlaceAssise()) 
            v.monteeDemanderAssis(this);
        else if (v.aPlaceDebout())
            v.monteeDemanderDebout(this);
    }
    
}
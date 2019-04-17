package tec;

public class Nerveux implements PassagerArret {

    // Pattern singleton
    private static PassagerArret singletonInst = null;

    public static PassagerArret getInstance() {
        if (Nerveux.singletonInst == null)
            Nerveux.singletonInst = new Nerveux();
        return Nerveux.singletonInst;
    }

    private Nerveux() {}

    @Override
    public void choixChangerPlace(VehiculeArret v, int arret, Passager p) {
        if (p.estAssis() && v.aPlaceDebout())
            v.arretDemanderDebout(p);
        else if (p.estDebout() && v.aPlaceAssise())
            v.arretDemanderAssis(p);
    }
    
}
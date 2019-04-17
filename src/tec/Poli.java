package tec;

public class Poli implements PassagerArret {

    // Pattern singleton
    private static PassagerArret singletonInst = null;

    public static PassagerArret getInstance() {
        if (Poli.singletonInst == null)
            Poli.singletonInst = new Poli();
        return Poli.singletonInst;
    }

    private Poli() {}

    @Override
    public void choixChangerPlace(VehiculeArret v, int arret, Passager p) {
        if (!v.aPlaceAssise() && v.aPlaceDebout())
            v.arretDemanderDebout(p);
    }
    
}
package tec;

public class Agoraphobe implements PassagerArret {

    // Pattern singleton
    private static PassagerArret singletonInst = null;

    public static PassagerArret getInstance() {
        if (Agoraphobe.singletonInst == null)
            Agoraphobe.singletonInst = new Agoraphobe();
        return Agoraphobe.singletonInst;
    }

    private Agoraphobe() {}

    @Override
    public void choixChangerPlace(VehiculeArret v, int arret, Passager p) {
        if (!v.aPlaceAssise() && !v.aPlaceDebout())
            v.arretDemanderSortie(p);
    }
    
}
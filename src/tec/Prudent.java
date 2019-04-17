package tec;

public class Prudent implements PassagerArret {

    // Pattern singleton
    private static PassagerArret singletonInst = null;

    public static PassagerArret getInstance() {
        if (Prudent.singletonInst == null)
            Prudent.singletonInst = new Prudent();
        return Prudent.singletonInst;
    }

    private Prudent() {}

    @Override
    public void choixChangerPlace(VehiculeArret v, int arret, Passager p) {
        if (p.getDestination() - arret >= 5 && p.estDebout() && v.aPlaceAssise())
            v.arretDemanderAssis(p);
        else if (p.getDestination() - arret <= 3 && p.estAssis() && v.aPlaceDebout())
            v.arretDemanderDebout(p);

    }
    
}